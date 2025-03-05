package good.stuff.webstore.service;

import good.stuff.webstore.generic.AbstractService;
import good.stuff.webstore.model.Order;
import good.stuff.webstore.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends AbstractService<Order, Long, OrderRepository> {
    @Autowired
    protected OrderService(OrderRepository repository) {
        super(repository);
    }
}
