package com.erick.hexarch.adapters.in.consumer;

import com.erick.hexarch.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.erick.hexarch.adapters.in.consumer.message.CustomerMessage;
import com.erick.hexarch.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "erick")
    public void receive(CustomerMessage customerMessage) {
        var customerDomain = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customerDomain, customerMessage.getZipCode());
    }

}
