package edu.autoservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Maintenance {

    private int id;
    private Person manager;
    private Person client;
    private Person master;
    private Vehicle vehicle;
    private List<ServiceItem> serviceItemList;
    private LocalDate Date;

}
