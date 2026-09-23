package shopsphere.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import shopsphere.backend.enums.CategoryStatus;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(
        name = "categories",
        uniqueConstraints = @UniqueConstraint(
                name = "uk_categories_name",
                columnNames = "name"
        )
)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Category extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "category_id", nullable = false, updatable = false)
    private UUID categoryId;

    @Column(name = "name", nullable = false, length = 120)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "status", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private CategoryStatus status;

    @ManyToMany(mappedBy = "categories")
    @Builder.Default
    private Set<Product> products=new HashSet<>();


}
