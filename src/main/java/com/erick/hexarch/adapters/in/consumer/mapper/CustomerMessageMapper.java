package com.erick.hexarch.adapters.in.consumer.mapper;

import com.erick.hexarch.adapters.in.consumer.message.CustomerMessage;
import com.erick.hexarch.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}
