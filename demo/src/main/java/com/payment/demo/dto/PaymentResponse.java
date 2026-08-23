package com.payment.demo.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponse {
    private String idempotencyKey;
    private BigDecimal amount;
    private String currency;
    private String status;
    private String fromAmount;
    private String toAccount;
    private LocalDateTime createdDate;
}
