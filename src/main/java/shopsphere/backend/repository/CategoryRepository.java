package shopsphere.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopsphere.backend.entity.Category;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
