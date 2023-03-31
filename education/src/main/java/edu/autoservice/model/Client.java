package edu.autoservice.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client extends Person {
    private int yearsWithCompany;
    private Vehicle vehicle;
    private PersonType personType = PersonType.CLIENT ;

    public PersonType getStatus() {
        return personType;
    }
}
