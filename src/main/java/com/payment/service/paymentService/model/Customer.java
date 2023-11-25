package com.payment.service.paymentService.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="CUSTOMER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @Column(name="ID_CUSTOMER")
    private int idCustomer;

    @Column(name="NAME_CUSTOMER")
    private String nameCustomer;

    @Column(name="LAST_NAME_CUSTOMER")
    private String lastNameCustomer;

    @Column(name="DNI_CUSTOMER")
    private String dniCustomer;

}
