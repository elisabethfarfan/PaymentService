package com.payment.service.paymentService.service.impl;

import com.payment.service.paymentService.model.Customer;
import com.payment.service.paymentService.service.ICustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Override
    public List<Customer> getCustomer(String customerId) {

        List<Customer> customerList  = new ArrayList<>();
        customerList.add(new Customer(1,"Elisabeth", "Farfan", "74589678"));
        customerList.add(new Customer(2,"Kalia", "Haydee", "65478923"));
        customerList.add(new Customer(3,"Jessica", "Ramirez", "12365478"));

        return customerList;
    }
}
