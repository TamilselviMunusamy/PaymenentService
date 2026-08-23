package com.payment.demo.dto;

import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreatePaymentRequest {

    BigDecimal amount;
    String currency;
    String fromAccount;
    String toAccount;

}
