package org.example.hexagonal.customer.port;

import org.example.hexagonal.customer.model.CreateNewCustomer;
import org.example.hexagonal.customer.model.Customer;
import org.example.hexagonal.customer.usecase.NewCustomerUseCase;

public interface CustomerPort {
    Customer addNewCustomer(CreateNewCustomer newCustomer);
}
