package org.example.hexagonal.customer;

import an.awesome.pipelinr.Command;
import lombok.RequiredArgsConstructor;
import org.example.hexagonal.customer.model.CreateNewCustomer;
import org.example.hexagonal.customer.model.Customer;
import org.example.hexagonal.customer.port.CustomerPort;
import org.example.hexagonal.customer.usecase.NewCustomerUseCase;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NewCustomerUseCaseHandler implements Command.Handler<NewCustomerUseCase, Customer> {

    private final CustomerPort customerPort;

    @Override
    public Customer handle(final NewCustomerUseCase newCustomerUseCase) {
        return customerPort.addNewCustomer(CreateNewCustomer.builder()
                .name(newCustomerUseCase.getName())
                .build());
    }
}
