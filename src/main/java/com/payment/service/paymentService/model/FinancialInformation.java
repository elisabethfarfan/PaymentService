package com.payment.service.paymentService.model;
import java.util.*;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="FINANTIAL_INFORMATION")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FinancialInformation {

    @Id
    @Column(name="ID_FINANTIAL_INFORMATION")
    private int idFinancialInformation;

    @Column(name="BALANCE")
    private double balance;

    @Column(name="ID_CUSTOMER")
    private int idCustomer;

    @Column(name="ID_SERVICE")
    private int idService;

    @Column(name="AMOUNT")
    private double amount;
    //private Date dateTransaction;

}
