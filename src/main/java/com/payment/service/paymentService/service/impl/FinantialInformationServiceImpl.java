package com.payment.service.paymentService.service.impl;
import com.payment.service.paymentService.model.FinancialInformation;
import com.payment.service.paymentService.service.IFinancialInformationService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FinantialInformationServiceImpl implements IFinancialInformationService {
    @Override
    public List<FinancialInformation> getFinancialInformation(String financialInformationId) {
        List<FinancialInformation> finantialInformationList  = new ArrayList<>();
        finantialInformationList.add(new FinancialInformation(1,5000,1,1, 50.5));
        finantialInformationList.add(new FinancialInformation(2,144000,1,2, 80.5));
        finantialInformationList.add(new FinancialInformation(3,578000,1,1, 72.5));

        return finantialInformationList;
    }
}
