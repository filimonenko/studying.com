package edu.autoservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Truck extends Vehicle {

    private int loadCapacity;
    private int enginePower;
    private static final String TYPE = "I am a Truck";

    @Override
    public String getType() {
        return TYPE;
    }
}
