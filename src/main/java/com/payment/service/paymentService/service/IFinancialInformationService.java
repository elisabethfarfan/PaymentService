package com.payment.service.paymentService.service;

import com.payment.service.paymentService.model.FinancialInformation;

import java.util.List;

public interface IFinancialInformationService {
    List<FinancialInformation> getFinancialInformation(String financialInformationId);
}
