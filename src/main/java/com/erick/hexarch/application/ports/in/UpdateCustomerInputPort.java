package com.erick.hexarch.application.ports.in;

import com.erick.hexarch.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
