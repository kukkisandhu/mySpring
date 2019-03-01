package gursharan.springframework.springmvcrest.repositories;

import gursharan.springframework.springmvcrest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomRepository extends JpaRepository<Customer,Long>  {}
