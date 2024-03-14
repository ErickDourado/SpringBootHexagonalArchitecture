package com.erick.hexarch.application.ports.out;

import com.erick.hexarch.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);

}
