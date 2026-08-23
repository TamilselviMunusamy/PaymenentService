package com.payment.demo.controller;

import com.payment.demo.dto.CreatePaymentRequest;
import com.payment.demo.dto.PaymentResponse;
import com.payment.demo.service.PaymentServiceInterface;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

        private  final PaymentServiceInterface paymentServiceInterface;
        public PaymentController(PaymentServiceInterface paymentServiceInterface) {
                this.paymentServiceInterface = paymentServiceInterface;
        }

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public PaymentResponse createPayment(
                @RequestHeader("Idempotency-Key") String idempotencyKey,
                @Valid @RequestBody CreatePaymentRequest request
        )
        {
                return paymentServiceInterface.createPayment(idempotencyKey,request);
        }
}
