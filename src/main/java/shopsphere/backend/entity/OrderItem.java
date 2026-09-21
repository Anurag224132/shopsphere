package shopsphere.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "order_items")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrderItem extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "order_item_id",nullable = false, updatable = false)
    private UUID orderItemId;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "quantity",nullable = false)
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Column(name = "unit_price",nullable = false,updatable = false ,precision = 19, scale = 2)
    private BigDecimal unitPrice;

    @Column(name = "total_price",nullable = false,updatable = false,precision = 19, scale = 2)
    private BigDecimal totalPrice;


}
