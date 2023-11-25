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
@Table(name="VOUCHER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Voucher {

    @Id
    @Column(name="ID_VOUCHER")
    private int idVoucher;

    @Column(name="DETAIL_VOUCHER")
    private String detailVoucher;

    @Column(name="ID_TRANSACTION")
    private int idTransaction;
}
