package org.example.hexagonal;

import an.awesome.pipelinr.Command;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewCustomerUseCase implements Command<Customer> {
    private String name;
}
