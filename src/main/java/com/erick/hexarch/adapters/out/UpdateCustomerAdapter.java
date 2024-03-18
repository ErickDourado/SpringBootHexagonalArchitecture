package com.erick.hexarch.adapters.out;

import com.erick.hexarch.adapters.out.repository.CustomerRepository;
import com.erick.hexarch.adapters.out.repository.mapper.CustomerEntityMapper;
import com.erick.hexarch.application.core.domain.Customer;
import com.erick.hexarch.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}
