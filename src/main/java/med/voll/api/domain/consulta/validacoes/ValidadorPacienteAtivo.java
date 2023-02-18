package med.voll.api.domain.consulta.validacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.paciente.PacienteRepository;
import med.voll.api.infra.exceptions.ValidacaoException;

@Component
public class ValidadorPacienteAtivo implements ValidadorAgendamentoDeConsultas {

	@Autowired
	private PacienteRepository pacienteRepository;

	public void validar(DadosAgendamentoConsulta dados) {
		if (dados.idMedico() == null) {
			return;
		}

		var pacienteEstaAtivo = pacienteRepository.findAtivoById(dados.idPaciente());
		if (!pacienteEstaAtivo) {
			throw new ValidacaoException("Consulta não pode ser agendada com médico exclusivo");
		}
	}
}
