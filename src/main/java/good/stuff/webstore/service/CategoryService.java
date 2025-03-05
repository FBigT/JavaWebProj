package good.stuff.webstore.service;

import good.stuff.webstore.generic.AbstractService;
import good.stuff.webstore.generic.GenericService;
import good.stuff.webstore.model.Category;
import good.stuff.webstore.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends AbstractService<Category,Long, CategoryRepository> {
    @Autowired
    protected CategoryService(CategoryRepository repository) {
        super(repository);
    }
}
