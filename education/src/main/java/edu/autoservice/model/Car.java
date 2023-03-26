package edu.autoservice.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car extends Vehicle{
    private int numberOfSeats;
    private static final String TYPE = "I am a Car";

    @Override
    public String getType() {
        return TYPE;
    }
}
