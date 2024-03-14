package com.erick.hexarch.application.ports.in;

import com.erick.hexarch.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
