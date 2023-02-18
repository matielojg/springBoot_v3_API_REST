package med.voll.api.domain.consulta.validacoes;

import java.time.Duration;
import java.time.LocalDateTime;

import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.infra.exceptions.ValidacaoException;

public class ValidacoesHorarioAntecedencia {

	public void validar(DadosAgendamentoConsulta dados) {
		var dataConsulta = dados.data();
		var agora = LocalDateTime.now();
		var diferencaEmMinutos = Duration.between(agora, dataConsulta).toMinutes();

		if (diferencaEmMinutos < 30) {
			throw new ValidacaoException("Consulta deve ser agendada com antecedência mínima de 30 minutos");
		}
	}

}
