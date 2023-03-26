package edu.autoservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Master extends Person {

    private int age;
    private int experience;
    private int salary ;
    private static final String STATUS = "I am a Master";

    public String getStatus() {
        return STATUS;
    }
}
