package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Não há necessidade de criar classes DAO ao extender de JpaRepository
 * @author Matielo
 */
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
