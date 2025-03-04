package good.stuff.webstore.model.discount;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("GLOBAL")
public class GlobalDiscount extends Discount {
}
