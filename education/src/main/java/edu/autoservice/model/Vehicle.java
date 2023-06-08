package edu.autoservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "VEHICLE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="bd_type")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public  class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String model;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToOne
    @JoinColumn(name = "master")
    private Master lastCheckedMaster;

}
