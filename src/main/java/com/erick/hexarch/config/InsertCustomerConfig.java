package com.erick.hexarch.config;

import com.erick.hexarch.adapters.out.FindAddressByZipCodeAdapter;
import com.erick.hexarch.adapters.out.InsertCustomerAdapter;
import com.erick.hexarch.adapters.out.SendCpfForValidationAdapter;
import com.erick.hexarch.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
                                                       InsertCustomerAdapter insertCustomerAdapter,
                                                       SendCpfForValidationAdapter sendCpfForValidationAdapter) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfForValidationAdapter);
    }

}
