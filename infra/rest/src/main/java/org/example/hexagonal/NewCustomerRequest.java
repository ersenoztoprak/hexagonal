package org.example.hexagonal;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class NewCustomerRequest {
    @NotBlank
    private String name;
}
