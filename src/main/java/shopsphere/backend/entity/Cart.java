package shopsphere.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import shopsphere.backend.enums.CartStatus;

import java.util.UUID;



//CREATE UNIQUE INDEX uq_active_cart_per_user
//ON cart (user_id)
//WHERE status = 'ACTIVE';
@Entity
@Table(
        name = "carts",
        indexes = @Index(name = "idx_cart_user_id", columnList = "user_id")
)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cart extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "cart_id",nullable = false,updatable = false)
    private UUID cartId;

    @Enumerated(EnumType.STRING)
    @Column(name = "status",nullable = false, length = 20)
    private CartStatus status;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;
}
