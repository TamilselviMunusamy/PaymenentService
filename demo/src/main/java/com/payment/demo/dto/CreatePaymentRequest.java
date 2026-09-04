package com.payment.demo.dto;

import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreatePaymentRequest {

    private BigDecimal amount;
    private String currency;
    private String fromAccount;
    private  String toAccount;

}
