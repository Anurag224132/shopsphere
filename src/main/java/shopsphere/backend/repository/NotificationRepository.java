package shopsphere.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopsphere.backend.entity.Notification;

import java.util.UUID;

public interface NotificationRepository extends JpaRepository<Notification, UUID> {
}
