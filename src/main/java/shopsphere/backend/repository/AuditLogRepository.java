package shopsphere.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopsphere.backend.entity.AuditLog;

import java.util.UUID;

public interface AuditLogRepository extends JpaRepository<AuditLog, UUID> {
}
