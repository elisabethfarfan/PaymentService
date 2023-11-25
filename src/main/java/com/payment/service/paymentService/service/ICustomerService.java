package com.payment.service.paymentService.service;

import com.payment.service.paymentService.model.Customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> getCustomer(String customerId);
}
