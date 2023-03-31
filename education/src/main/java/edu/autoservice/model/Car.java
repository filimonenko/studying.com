package edu.autoservice.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car extends Vehicle{
    private int numberOfSeats;
    private VehicleType vehicleType = VehicleType.CAR;

    @Override
    public VehicleType getType() {
        return vehicleType;
    }
}
