package shopsphere.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopsphere.backend.entity.Order;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
