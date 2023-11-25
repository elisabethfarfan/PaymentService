package com.payment.service.paymentService.service.impl;
import com.payment.service.paymentService.model.Services;
import com.payment.service.paymentService.service.IServicesService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicesServiceImpl implements IServicesService {
    @Override
    public List<Services> getServices(String servicesId) {
        List<Services> servicesList  = new ArrayList<>();
        servicesList.add(new Services(1,"Agua", 50.89, "A01"));
        servicesList.add(new Services(2,"Luz", 78.9, "A02"));
        servicesList.add(new Services(3,"Internet", 100.50, "B05"));

        return servicesList;
    }
}
