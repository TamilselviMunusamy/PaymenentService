package com.payment.demo.service;

import com.payment.demo.dto.*;

public interface PaymentServiceInterface {
    PaymentResponse createPayment(String idempotencyKey, CreatePaymentRequest paymentRequest);

    PaymentResponse createDeposit(String idempotencyKey, CreateDepositRequest request);

    PaymentWithdrawalResponse createWithdrawal(String idempotencyKey, CreateWithdrawalRequest request);
}
