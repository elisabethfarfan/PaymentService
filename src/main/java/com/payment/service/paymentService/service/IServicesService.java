package com.payment.service.paymentService.service;

import com.payment.service.paymentService.model.Services;

import java.util.List;

public interface IServicesService {

    List<Services> getServices(String servicesId);
}
