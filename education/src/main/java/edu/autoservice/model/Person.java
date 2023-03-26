package edu.autoservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Person {

    private int id;
    private String name;
    private static final String STATUS = "I am a Person";

    public String getStatus() {
        return STATUS;
    }

}
