package org.example.hexagonal.customer.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateNewCustomer {
    private String name;
}
