package com.erick.hexarch.adapters.out.repository;

import com.erick.hexarch.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> { }
