package de.timjungk.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;

import javax.annotation.processing.Generated;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
public class Customer {

    @Id
    private int Id;

    private String name;

    private LocalDate age;
}

