package edu.autoservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Manager extends Person {
    private int age;
    private int experience;
    private int salary ;
    private PersonType personType = PersonType.MANAGER;

    public PersonType getStatus() {
        return personType;
    }
}
