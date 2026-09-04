package com.payment.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class CreateDepositRequest {

    @NotNull
    private String currency;
    @NotNull
    @Positive
    private BigDecimal amount;
    @NotBlank
    private String iban;

}
