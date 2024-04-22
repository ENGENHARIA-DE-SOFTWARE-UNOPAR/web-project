package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import resource.UserResource;

public interface UserRepository extends JpaRepository<User, Long> {
    // Seu código vai aqui
}
