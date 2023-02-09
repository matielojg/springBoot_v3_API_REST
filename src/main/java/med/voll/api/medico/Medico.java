package med.voll.api.medico;



import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.Endereco;

@Table(name = "medicos")
@Getter
@NoArgsConstructor // Gera o constructor default sem argumentos, JPA exige em todas as entidades
@AllArgsConstructor // Constructor que recebe todos os campos
@EqualsAndHashCode(of = "id") // permite que objetos sejam comparados por valor e usados como chaves em estruturas de dados baseadas em hash
@Entity
public class Medico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String crm;
	private String telefone;

	@Enumerated(EnumType.STRING)
	private Especialidade especialidade;

	/**
	 * Embeddable Attribute Assim eu consigo separar a classe endereço, porém no
	 * banco fará parte da mesma tabela "médicos" Necessário anotar na classe
	 * endereço com @Embeddable
	 */
	@Embedded
	private Endereco endereco;

	public Medico(DadosCadastroMedico dados) {
		this.nome = dados.nome();
		this.email = dados.email();
		this.crm = dados.crm();
		this.telefone = dados.telefone();
		this.endereco = new Endereco(dados.endereco());
		this.especialidade = dados.especialidade();
	}
}
