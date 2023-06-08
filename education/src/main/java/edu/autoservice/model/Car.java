package edu.autoservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
@Entity
@DiscriminatorValue("C")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car extends Vehicle{

    @Column(name = "number_of_seats")
    private int numberOfSeats;
}
