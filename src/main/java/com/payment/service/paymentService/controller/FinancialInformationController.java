package com.payment.service.paymentService.controller;

import com.payment.service.paymentService.model.FinancialInformation;
import com.payment.service.paymentService.service.IFinancialInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/finantialInformation")
public class FinancialInformationController {

    @Autowired
    IFinancialInformationService finantialInformationService;

    @GetMapping
    public ResponseEntity<List<FinancialInformation>> getFinantialInformation(){
        return new ResponseEntity<>(finantialInformationService.getFinancialInformation(""), HttpStatus.OK);
    }
}
