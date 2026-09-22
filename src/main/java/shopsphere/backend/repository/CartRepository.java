package shopsphere.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopsphere.backend.entity.Cart;

import java.util.UUID;

public interface CartRepository extends JpaRepository<Cart, UUID> {
}
