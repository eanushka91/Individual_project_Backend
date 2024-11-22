package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class E_License {
    private String name;
    private String dob;
    private String licenseno;
    private String address;
    private String issuedate;
    private String expirydate;
    private String status;
}
