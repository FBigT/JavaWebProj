package good.stuff.webstore.model.discount;

import good.stuff.webstore.model.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.Date;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "discount_type", discriminatorType = DiscriminatorType.STRING)
@Entity
public abstract class Discount extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(length = 500)
    private String description;

    @Min(0)
    @Max(100)
    @Column(nullable = false)
    private int discountPercent;
    @Column(nullable = false)
    private boolean active;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Future(message = "Activation date must be in the future")
    private Date activationDate;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Future(message = "Expiration date must be in the future")
    private Date expirationDate;

    protected void validateDates() {
        if (activationDate != null && expirationDate != null && activationDate.after(expirationDate)) {
            throw new IllegalArgumentException("Activation date must be before expiration date");
        }
    }

    @Override
    protected void onCreate() {
        super.onCreate();
        validateDates();
    }

    @Override
    protected void onUpdate() {
        super.onUpdate();
        validateDates();
    }
}

