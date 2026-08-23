package com.payment.demo.serviceImpl;

import com.payment.demo.dto.CreatePaymentRequest;
import com.payment.demo.dto.PaymentResponse;
import com.payment.demo.entity.Payment;
import com.payment.demo.repo.PaymentRepository;
import com.payment.demo.service.PaymentServiceInterface;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PaymentServiceImpl implements PaymentServiceInterface {

  private final PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public PaymentResponse createPayment(String idempotencyKey, CreatePaymentRequest paymentRequest) {
            Payment payment = Payment.builder().
                    idempotencyKey(idempotencyKey)
                    .amount(paymentRequest.getAmount())
                    .currency(paymentRequest.getCurrency())
                    .fromaccount(paymentRequest.getFromAccount())
                    .toaccount(paymentRequest.getToAccount())
                    .status("Success")
                    .createdDate(LocalDateTime.now())
                    .build();


        Payment saved = paymentRepository.save(payment);
        return new PaymentResponse(
                saved.getIdempotencyKey(),
                saved.getAmount(),
                saved.getCurrency(),
                saved.getFromaccount(),
                saved.getToaccount(),
                saved.getStatus(),
                saved.getCreatedDate()
                );

    }
}
