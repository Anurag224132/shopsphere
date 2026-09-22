package shopsphere.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopsphere.backend.entity.CartItem;

import java.util.UUID;

public interface CartItemRepository extends JpaRepository<CartItem, UUID> {
}
