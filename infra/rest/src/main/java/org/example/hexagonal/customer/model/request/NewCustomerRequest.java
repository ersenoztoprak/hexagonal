package org.example.hexagonal.customer.model.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class NewCustomerRequest {
    @NotBlank
    private String name;
}
