package com.muhardin.endy.belajar.belajartimezone.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalTime;

@Entity
@Data
public class Jadwal {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @NotEmpty
    private String nama;

    @NotNull
    private LocalTime jamMasuk;

    @NotNull
    private LocalTime jamKeluar;
}
