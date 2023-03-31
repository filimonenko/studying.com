package edu.autoservice.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Vehicle {
    private int id;
    private String model;
    private Client owner;
    private Master lastCheckedMaster;
    public abstract VehicleType getType();

}
