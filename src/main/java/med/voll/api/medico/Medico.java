package med.voll.api.medico;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.Endereco;

@Table(appliesTo = "medicos")
@Entity(name = "Medico")
@Getter 			
@NoArgsConstructor  // Gera o constructor default sem argumentos, JPA exige em todas as entidades
@AllArgsConstructor // Constructor que recebe todos os campos
@EqualsAndHashCode(of="id") //permite que objetos sejam comparados por valor e usados como chaves em estruturas de dados baseadas em hash
public class Medico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String crm;

	@Enumerated(EnumType.STRING)
	private Especialidade especialidade;

	/**
	 *	Embeddable Attribute 
	 *	Assim eu consigo separar a classe endereço, porém no banco fará parte da mesma tabela "médicos"
	 *	Necessário anotar na classe endereço com @Embeddable
	 */ 
	@Embedded
	private Endereco endereco;

}
