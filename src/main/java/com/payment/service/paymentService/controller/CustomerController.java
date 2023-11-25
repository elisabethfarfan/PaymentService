package com.payment.service.paymentService.controller;

import com.payment.service.paymentService.model.Customer;
import com.payment.service.paymentService.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    ICustomerService customerService;

    @GetMapping
    public ResponseEntity<List<Customer>> getCustomer(){
        return new ResponseEntity<>(customerService.getCustomer(""), HttpStatus.OK);
    }
}
