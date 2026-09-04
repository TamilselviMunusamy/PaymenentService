package com.payment.demo.controller;

import com.payment.demo.dto.*;
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

        @PostMapping("/deposit")
        @ResponseStatus(HttpStatus.CREATED)
        public PaymentResponse depositCreation(@RequestHeader ("Idempotency-Key") String idempotencyKey, @Valid @RequestBody CreateDepositRequest request){
                return paymentServiceInterface.createDeposit(idempotencyKey,request);
        }
        @PostMapping("/withdrawal")
        @ResponseStatus(HttpStatus.CREATED)
        public PaymentWithdrawalResponse withdrawalCreation(@RequestHeader("Idempotency-Key") String idempotencyKey,@Valid @RequestBody CreateWithdrawalRequest request){
                return paymentServiceInterface.createWithdrawal(idempotencyKey,request);
        }
}
