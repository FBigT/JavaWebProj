package good.stuff.webstore.model.discount;

import good.stuff.webstore.model.Category;
import good.stuff.webstore.model.Product;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@DiscriminatorValue("LOCAL")
public class LocalDiscount extends Discount {
    @ManyToMany
    @JoinTable(
            name = "discount_product",
            joinColumns = @JoinColumn(name = "discount_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private Set<Product> products;
    @ManyToMany
    @JoinTable(
            name = "discount_category",
            joinColumns = @JoinColumn(name = "discount_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> categories;
}

