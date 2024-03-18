package com.erick.hexarch.application.ports.in;

import com.erick.hexarch.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
