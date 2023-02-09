package med.voll.api.endereco;

import jakarta.validation.constraints.*;

public record DadosEndereco(
		@NotBlank
		String logradouro,
		@NotBlank
		String bairro,
		@NotBlank
		@Pattern(regexp = "\\d{4,6}")
		String cep,
		@NotBlank
		String cidade,
		@NotBlank
		String uf, 
		String complemento, 
		String numero 
		) {

}
