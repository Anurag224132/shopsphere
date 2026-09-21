package shopsphere.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopsphere.backend.entity.Inventory;

import java.util.UUID;

public interface InventoryRepository extends JpaRepository<Inventory, UUID> {
}
