package good.stuff.webstore.service;

import good.stuff.webstore.generic.AbstractService;
import good.stuff.webstore.model.discount.Discount;
import good.stuff.webstore.repository.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountService extends AbstractService<Discount, Long, DiscountRepository> {
    @Autowired
    protected DiscountService(DiscountRepository repository) {
        super(repository);
    }
}
