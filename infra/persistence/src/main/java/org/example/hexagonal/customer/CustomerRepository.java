package org.example.hexagonal.customer;

import org.example.hexagonal.customer.model.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {
}
