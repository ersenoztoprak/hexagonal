package org.example.hexagonal.customer.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewCustomerResponse {
    private long id;
}
