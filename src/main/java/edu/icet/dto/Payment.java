package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Payment {
    private String cardholder;
    private String cardNumber;
    private String expirydate;
    private String cvv;
}
