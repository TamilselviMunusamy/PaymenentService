package com.payment.demo.service;

import com.payment.demo.dto.CreatePaymentRequest;
import com.payment.demo.dto.PaymentResponse;

public interface PaymentServiceInterface {
    PaymentResponse createPayment(String idempotencyKey, CreatePaymentRequest paymentRequest);

}
