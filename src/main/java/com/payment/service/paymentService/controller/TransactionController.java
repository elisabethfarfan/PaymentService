package com.payment.service.paymentService.controller;

import com.payment.service.paymentService.model.Transaction;
import com.payment.service.paymentService.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/transactions")
public class TransactionController {
    @Autowired
    ITransactionService transactionService;

    @GetMapping
    public ResponseEntity<List<Transaction>> getTransactions(){
        return new ResponseEntity<>(transactionService.getTransaction(""), HttpStatus.OK);
    }
}
