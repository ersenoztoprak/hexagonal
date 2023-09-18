package org.example.hexagonal;

import an.awesome.pipelinr.Command;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NewCustomerUseCaseHandler implements Command.Handler<NewCustomerUseCase, Customer> {

    private final CustomerPort customerPort;

    @Override
    public Customer handle(final NewCustomerUseCase newCustomerUseCase) {

        return customerPort.addNewCustomer(newCustomerUseCase);
    }
}
