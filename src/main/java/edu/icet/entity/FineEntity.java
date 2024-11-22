package edu.icet.entity;

import jakarta.persistence.*;
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
@Entity
@Table(name = "fine")
public class FineEntity {
        @Id
        private String vehicleno;

        private String violation;
        private String location;
        private String date;
        private String time;
        private Double fineamount;
        private String status;
        private String licenseno;
}
