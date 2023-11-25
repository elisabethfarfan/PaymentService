package com.payment.service.paymentService.service;

import com.payment.service.paymentService.model.Transaction;

import java.util.List;

public interface ITransactionService {
    List<Transaction> getTransaction(String transactionId);
}
