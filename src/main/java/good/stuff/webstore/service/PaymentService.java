package good.stuff.webstore.service;

import good.stuff.webstore.generic.AbstractService;
import good.stuff.webstore.model.payment.PaymentMethod;
import good.stuff.webstore.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService extends AbstractService<PaymentMethod, Long, PaymentRepository> {
    @Autowired
    protected PaymentService(PaymentRepository repository) {
        super(repository);
    }
}
