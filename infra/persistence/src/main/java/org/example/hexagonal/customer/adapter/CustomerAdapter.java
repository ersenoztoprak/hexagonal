package org.example.hexagonal.customer.adapter;

import lombok.RequiredArgsConstructor;
import org.example.hexagonal.customer.CustomerRepository;
import org.example.hexagonal.customer.model.Customer;
import org.example.hexagonal.customer.model.CustomerEntity;
import org.example.hexagonal.customer.port.CustomerPort;
import org.example.hexagonal.customer.usecase.NewCustomerUseCase;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerAdapter implements CustomerPort {

    private final CustomerRepository customerRepository;
    @Override
    public Customer addNewCustomer(NewCustomerUseCase newCustomer) {
        final CustomerEntity customerEntity = customerRepository.save(
                CustomerEntity.builder()
                        .name(newCustomer.getName())
                        .build());

        return customerEntity.toModel();
    }
}
