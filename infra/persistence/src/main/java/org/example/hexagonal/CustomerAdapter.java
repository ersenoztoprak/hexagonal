package org.example.hexagonal;

import lombok.RequiredArgsConstructor;
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
