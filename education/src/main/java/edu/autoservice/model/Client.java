package edu.autoservice.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client extends Person {
    private int yearsWithCompany;
    private Vehicle vehicle;
    private PersonType personType = PersonType.CLIENT ;
    private List<ServiceItem> completedServiceItems;
    private List<ServiceItem> orderedServiceItems;

    public PersonType getStatus() {
        return personType;
    }
}

