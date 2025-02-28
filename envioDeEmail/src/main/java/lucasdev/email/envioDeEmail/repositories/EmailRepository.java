package lucasdev.email.envioDeEmail.repositories;

import lucasdev.email.envioDeEmail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
}
