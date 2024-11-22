package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Time;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Fine {
    private String vehicleno;
    private String violation;
    private String location;
    private String date;
    private String time;
    private Double fineamount;
    private String status;
    private String licenseno;
}
