package org.example.hexagonal;

public interface CustomerPort {
    Customer addNewCustomer(NewCustomerUseCase newCustomer);
}
