package com.erick.hexarch.config;

import com.erick.hexarch.adapters.out.FindAddressByZipCodeAdapter;
import com.erick.hexarch.adapters.out.UpdateCustomerAdapter;
import com.erick.hexarch.application.core.usecase.FindCustomerByIdUseCase;
import com.erick.hexarch.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase,
                                                       FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
                                                       UpdateCustomerAdapter updateCustomerAdapter) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }

}
