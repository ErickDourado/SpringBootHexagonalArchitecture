package com.erick.hexarch.adapters.out.repository.mapper;

import com.erick.hexarch.adapters.out.repository.entity.CustomerEntity;
import com.erick.hexarch.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

}
