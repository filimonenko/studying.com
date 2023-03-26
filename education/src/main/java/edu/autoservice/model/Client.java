package edu.autoservice.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client extends Person {
    private int yearsWithCompany;
    private Vehicle vehicle;
    private final String STATUS = "I am a Client";


    public String getSTATUS() {
        return STATUS;
    }
}
