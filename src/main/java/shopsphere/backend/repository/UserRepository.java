package shopsphere.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopsphere.backend.entity.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
