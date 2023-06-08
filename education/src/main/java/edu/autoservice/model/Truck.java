package edu.autoservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.DescriptorKey;

@Entity
@DiscriminatorValue("T")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Truck extends Vehicle {

    @Column(name = "load_capacity")
    private int loadCapacity;

    @Column(name = "engine_power")
    private int enginePower;

}
