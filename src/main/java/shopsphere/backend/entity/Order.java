package shopsphere.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import shopsphere.backend.enums.OrderStatus;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Order extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "order_id",nullable = false,updatable = false)
    private UUID orderId;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "status",nullable = false, length = 20)
    private OrderStatus status;

    @Column(name = "currency", nullable = false, length = 3)
    private String currency;

    @Column(
            name = "total_amount",
            nullable = false,
            updatable = false,
            precision = 19,
            scale = 2
    )
    private BigDecimal totalAmount;

    @Column(name = "shipping_name", nullable = false, length = 120)
    private String shippingName;

    @Column(name = "shipping_phone_number", nullable = false, length = 20)
    private String shippingPhoneNumber;

    @Column(name = "shipping_address_line_1", nullable = false)
    private String shippingAddressLine1;

    @Column(name = "shipping_address_line_2")
    private String shippingAddressLine2;

    @Column(name = "shipping_landmark")
    private String shippingLandmark;

    @Column(name = "shipping_city", nullable = false)
    private String shippingCity;

    @Column(name = "shipping_state",nullable = false)
    private String shippingState;

    @Column(name = "shipping_country",nullable = false)
    private String shippingCountry;

    @Column(name = "shipping_pincode", nullable = false, length = 12)
    private String shippingPincode;



}
