package med.voll.api.domain.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuarios")
@Getter
@NoArgsConstructor // Gera o constructor default sem argumentos, JPA exige em todas as entidades
@AllArgsConstructor // Constructor que recebe todos os campos
@EqualsAndHashCode(of = "id") // permite que objetos sejam comparados por valor e usados como chaves em estruturas de dados baseadas em hash
@Entity(name = "Usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String login;
	private String senha;
}
