package shopsphere.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(
        name = "inventory",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_inventory_product_id", columnNames = "product_id")
        }
)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Inventory extends BaseEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        @Column(name = "inventory_id",nullable = false,updatable = false)
        private UUID inventoryId;

        @Column(name = "quantity_available", nullable = false)
        private Integer quantityAvailable;

        @Column(name = "quantity_reserved", nullable = false)
        private Integer quantityReserved;

        @Column(name = "quantity_sold", nullable = false)
        private Integer quantitySold;

        @OneToOne
        @JoinColumn(name = "product_id",nullable = false)
        private Product product;
}
