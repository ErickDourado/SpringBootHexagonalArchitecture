package com.erick.hexarch.adapters.out;

import com.erick.hexarch.adapters.out.repository.CustomerRepository;
import com.erick.hexarch.adapters.out.repository.mapper.CustomerEntityMapper;
import com.erick.hexarch.application.core.domain.Customer;
import com.erick.hexarch.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }

}
