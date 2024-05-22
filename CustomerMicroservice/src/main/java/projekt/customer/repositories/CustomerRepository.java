package projekt.customer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projekt.customer.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
