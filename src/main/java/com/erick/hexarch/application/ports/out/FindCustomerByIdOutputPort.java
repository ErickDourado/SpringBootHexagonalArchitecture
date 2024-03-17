package com.erick.hexarch.application.ports.out;

import com.erick.hexarch.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);

}
