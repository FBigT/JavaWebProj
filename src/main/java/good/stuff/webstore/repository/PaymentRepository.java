package good.stuff.webstore.repository;

import good.stuff.webstore.model.payment.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentMethod, Long> {
}
