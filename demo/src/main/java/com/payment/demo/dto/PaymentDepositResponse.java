package com.payment.demo.dto;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PaymentDepositResponse {
    String idempotencyKey;
    Double amount;
    String currency;
    String iban;
    String status;
    LocalDate createdDate;

}
