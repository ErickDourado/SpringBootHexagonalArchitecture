package com.erick.hexarch.adapters.in.controller;

import com.erick.hexarch.adapters.in.controller.mapper.CustomerMapper;
import com.erick.hexarch.adapters.in.controller.request.CustomerRequest;
import com.erick.hexarch.adapters.in.controller.response.CustomerResponse;
import com.erick.hexarch.application.ports.in.DeleteCustomerByIdInputPort;
import com.erick.hexarch.application.ports.in.FindCustomerByIdInputPort;
import com.erick.hexarch.application.ports.in.InsertCustomerInputPort;
import com.erick.hexarch.application.ports.in.UpdateCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private DeleteCustomerByIdInputPort deleteCustomerByIdInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody @Valid CustomerRequest customerRequest) {
        var customerDomain = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customerDomain, customerRequest.getZipCode());
        return ResponseEntity.status(CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable String id) {
        var customerDomain = findCustomerByIdInputPort.find(id);
        return ResponseEntity.ok(customerMapper.toCustomerResponse(customerDomain));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable String id, @RequestBody @Valid CustomerRequest customerRequest) {
        var customerDomain = customerMapper.toCustomer(customerRequest);
        customerDomain.setId(id);
        updateCustomerInputPort.update(customerDomain, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        deleteCustomerByIdInputPort.delete(id);
        return ResponseEntity.noContent().build();
    }

}
