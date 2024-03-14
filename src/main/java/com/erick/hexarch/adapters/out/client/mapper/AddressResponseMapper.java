package com.erick.hexarch.adapters.out.client.mapper;

import com.erick.hexarch.adapters.out.client.response.AddressResponse;
import com.erick.hexarch.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
