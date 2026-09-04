package com.payment.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateWithdrawalRequest {
    @NotBlank
    private String currency;
    @NotNull
    @Positive
    private Double Amount;
    @NotBlank
    private String iban;

}
