package com.payment.service.paymentService.service.impl;

import com.payment.service.paymentService.model.Transaction;
import com.payment.service.paymentService.service.ITransactionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionServiceImpl implements ITransactionService {
    @Override
    public List<Transaction> getTransaction(String transactionId) {
        List<Transaction> transactionsList  = new ArrayList<>();
        transactionsList.add(new Transaction(1,1));
        transactionsList.add(new Transaction(2,1));
        transactionsList.add(new Transaction(3,2));

        return transactionsList;
    }
}
