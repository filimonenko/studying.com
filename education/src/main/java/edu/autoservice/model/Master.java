package edu.autoservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "MASTER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Master{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column
    private int age;

    @Column
    private int experience;

    @Column
    private int salary ;
}
