package com.payment.service.paymentService.service.impl;

import com.payment.service.paymentService.model.Voucher;
import com.payment.service.paymentService.service.IVoucherService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VoucherServiceImpl implements IVoucherService {
    @Override
    public List<Voucher> getVoucher(String voucherId) {
        List<Voucher> voucherList  = new ArrayList<>();
        voucherList.add(new Voucher(1,"detalle",1));
        voucherList.add(new Voucher(2,"detalle2",2));
        voucherList.add(new Voucher(3,"detalle3",3));

        return voucherList;
    }
}
