package edu.autoservice.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "SERVICE_ITEMS")
@NoArgsConstructor
@AllArgsConstructor
public class ServiceItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int code;

    @Column(name = "service_item_type")
    private ServiceItemType serviceType;

    @Column
    private  double cost;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "maintenance_id")
    private Maintenance maintenance;

}
