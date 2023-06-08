package edu.autoservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "CLIENT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "years_with_company")
    private int yearsWithCompany;

    @OneToMany(mappedBy = "client")
    private List<Vehicle> vehicles;

    @OneToMany(mappedBy = "client")
    private List<ServiceItem> completedServiceItems;

    @OneToMany(mappedBy = "client")
    private List<ServiceItem> orderedServiceItems;

    @OneToMany(mappedBy = "client")
    private List<Maintenance> maintenances;

}


