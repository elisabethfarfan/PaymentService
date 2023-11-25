package com.payment.service.paymentService.controller;
import com.payment.service.paymentService.model.Services;
import com.payment.service.paymentService.service.IServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/services")
public class ServicesController {
    @Autowired
    IServicesService servicesService;

    @GetMapping
    public ResponseEntity<List<Services>> getServices(){
        return new ResponseEntity<>(servicesService.getServices(""), HttpStatus.OK);
    }
}
