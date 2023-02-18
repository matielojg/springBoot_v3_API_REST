package med.voll.api.domain.consulta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import med.voll.api.domain.consulta.validacoes.ValidadorAgendamentoDeConsultas;
import med.voll.api.domain.medico.Medico;
import med.voll.api.domain.medico.MedicoRepository;
import med.voll.api.domain.paciente.PacienteRepository;
import med.voll.api.infra.exceptions.ValidacaoException;

@Service
public class AgendaDeConsultas {

	@Autowired
	private ConsultaRepository consultaRepository;

	@Autowired
	private MedicoRepository medicoRepository;

	@Autowired
	private PacienteRepository pacienteRepository;

	/**
	 * Injetando todos os validadores
	 */
	@Autowired
	private List<ValidadorAgendamentoDeConsultas> validadores;

	public DadosDetalhamentoConsulta agendar(DadosAgendamentoConsulta dados) {
		if (!pacienteRepository.existsById(dados.idPaciente())) {
			throw new ValidacaoException("Id do paciente informado não existe");
		}
		/**
		 * Id do médico nao é obrigatório, o que obriga a verificar se o idMedico veio
		 * preenchido e dai sim verificar se existe o id no banco de dados;
		 */
		if (dados.idMedico() != null && !medicoRepository.existsById(dados.idMedico())) {
			throw new ValidacaoException("Id do medico informado não existe");
		}

		/**
		 * PATTERN STRATEGY SOD do Solid S - SINGLE RESPONSIBILITY PRINCIPLE O -
		 * OPEN-CLOSED PRINCIPLE - FECHADA PRA MODIFICACAO PORÉM ABERTA PARA EXTENSÃO D
		 * - DEPENDENCY INVERSION PRINCIPLE
		 */
		validadores.forEach(v -> v.validar(dados));

		var paciente = pacienteRepository.getReferenceById(dados.idPaciente());
		var medico = escolherMedico(dados);
		if (medico == null) {
			throw new ValidacaoException("Não existe médico disponível nessa data!");
		}
		var consulta = new Consulta(null, medico, paciente, dados.data());
		consultaRepository.save(consulta);

		return new DadosDetalhamentoConsulta(consulta);

	}

	private Medico escolherMedico(DadosAgendamentoConsulta dados) {
		// TODO Auto-generated method stub
		if (dados.idMedico() != null) {
			return medicoRepository.getReferenceById(dados.idMedico());
		}
		if (dados.especialidade() != null) {
			throw new ValidacaoException("Especialidade é obrigatória quando médico não for escolhido");
		}
		return medicoRepository.escolherMedicoAleatorioLivreNaData(dados.especialidade(), dados.data());
	}
}
