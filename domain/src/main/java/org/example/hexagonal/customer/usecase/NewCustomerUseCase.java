package org.example.hexagonal.customer.usecase;

import an.awesome.pipelinr.Command;
import lombok.Builder;
import lombok.Data;
import org.example.hexagonal.customer.model.Customer;

@Data
@Builder
public class NewCustomerUseCase implements Command<Customer> {
    private String name;
}
