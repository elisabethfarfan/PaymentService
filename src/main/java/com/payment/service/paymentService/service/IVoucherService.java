package com.payment.service.paymentService.service;

import com.payment.service.paymentService.model.Voucher;

import java.util.List;

public interface IVoucherService {
    List<Voucher> getVoucher(String voucherId);
}
