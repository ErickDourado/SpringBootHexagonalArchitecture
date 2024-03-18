package com.erick.hexarch.application.ports.out;

import com.erick.hexarch.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);

}
