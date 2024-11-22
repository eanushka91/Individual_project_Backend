package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "elicense")
public class E_LicenseEntity {
    @Id
    private String licenseno;

    private String name;
    private String dob;
    private String address;
    private String issuedate;
    private String expirydate;
    private String status;
}
