package edu.autoservice.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client extends Person {
    private int yearsWithCompany;
    private Vehicle vehicle;
    private static final String STATUS = "I am a Client";


    public String getStatus() {
        return STATUS;
    }
}
