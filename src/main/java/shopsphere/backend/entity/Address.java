package shopsphere.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import shopsphere.backend.enums.AddressType;

import java.util.UUID;

@Entity
@Table(name = "addresses")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Address extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "address_id",nullable = false, updatable = false)
    private UUID addressId;

    @Column(name = "pincode", nullable = false, length = 10)
    private String pincode;

    @Column(name = "city", nullable = false, length = 255)
    private String city;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    @Column(name = "name",length = 255,nullable = false)
    private String name;

    @Column(name = "phone_number", nullable = false, length = 20)
    private String phoneNumber;

    @Column(name = "address_line_1", nullable = false)
    private String addressLine1;

    @Column(name = "address_line_2")
    private String addressLine2;

    @Column(name = "landmark", length = 255)
    private String landmark;

    @Column(name = "state", nullable = false, length = 255)
    private String state;

    @Column(name = "country", nullable = false, length = 255)
    private String country;

    @Enumerated(EnumType.STRING)
    @Column(name = "address_type", nullable = false, length = 10)
    private AddressType addressType;
}
