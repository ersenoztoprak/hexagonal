package org.example.hexagonal.customer.adapter;

import lombok.RequiredArgsConstructor;
import org.example.hexagonal.customer.CustomerRepository;
import org.example.hexagonal.customer.model.CreateNewCustomer;
import org.example.hexagonal.customer.model.Customer;
import org.example.hexagonal.customer.model.CustomerEntity;
import org.example.hexagonal.customer.port.CustomerPort;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerAdapter implements CustomerPort {

    private final CustomerRepository customerRepository;
    @Override
    public Customer addNewCustomer(CreateNewCustomer newCustomer) {
        final CustomerEntity customerEntity = customerRepository.save(
                CustomerEntity.builder()
                        .name(newCustomer.getName())
                        .build());

        return customerEntity.toModel();
    }
}
