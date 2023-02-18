package med.voll.api.domain.consulta.validacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.infra.exceptions.ValidacaoException;

@Component
public class ValidadorMedicoComOutraConsultaNoMesmoHorario implements ValidadorAgendamentoDeConsultas {

	@Autowired
	private ConsultaRepository consultaRepository;

	public void validar(DadosAgendamentoConsulta dados) {
		var medicoPossuiOutraConsultaNoMesmoHorario = consultaRepository.existsByMedicoIdAndData(dados.idMedico(),
				dados.data());
		if (medicoPossuiOutraConsultaNoMesmoHorario) {
			throw new ValidacaoException("Médico já possui outra consulta agendada nesse mesmo horário");
		}
	}
}
