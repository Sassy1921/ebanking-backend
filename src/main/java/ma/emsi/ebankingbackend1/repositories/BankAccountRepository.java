package ma.emsi.ebankingbackend1.repositories;

import ma.emsi.ebankingbackend1.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
