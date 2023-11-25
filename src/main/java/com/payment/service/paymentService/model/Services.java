package com.payment.service.paymentService.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="SERVICES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Services {

    @Id
    @Column(name="ID_SERVICE")
    private int idService;

    @Column(name="NAME_SERVICE")
    private String nameService;

    @Column(name="AMOUNT_SERVICE")
    private double amountService;

    @Column(name="TYPE_SERVICE")
    private String typeService;

}
