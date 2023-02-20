package med.voll.api.domain.consulta.validacoes.cancelamento;

import java.time.Duration;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosCancelamentoConsulta;
import med.voll.api.infra.exceptions.ValidacaoException;

@Component("ValidadorHorarioAntecedenciaCancelamento")
public class ValidadorHorarioAntecedencia  implements ValidadorCancelamentoDeConsulta {
	 @Autowired
	    private ConsultaRepository repository;

	    @Override
	    public void validar(DadosCancelamentoConsulta dados)  {
	        var consulta = repository.getReferenceById(dados.idConsulta());
	        var agora = LocalDateTime.now();
	        var diferencaEmHoras = Duration.between(agora, consulta.getData()).toHours();

	        if (diferencaEmHoras < 24) {
	            throw new ValidacaoException("Consulta somente pode ser cancelada com antecedência mínima de 24h!");
	        }
	    }
	    //https://github.com/alura-cursos/2771-spring-boot/blob/0caa24995a/src/main/java/med/voll/api/domain/consulta/validacoes/cancelamento/ValidadorCancelamentoDeConsulta.java
}
