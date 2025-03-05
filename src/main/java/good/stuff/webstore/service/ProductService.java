package good.stuff.webstore.service;

import good.stuff.webstore.generic.AbstractService;
import good.stuff.webstore.model.Product;
import good.stuff.webstore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends AbstractService<Product, Long, ProductRepository> {
    @Autowired
    protected ProductService(ProductRepository repository) {
        super(repository);
    }
}
