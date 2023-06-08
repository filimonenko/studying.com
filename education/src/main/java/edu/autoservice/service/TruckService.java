package edu.autoservice.service;

import edu.autoservice.model.Truck;

import java.util.List;
import java.util.Optional;

public interface TruckService  {

    Optional<Truck> getTruck(int id);

    void addTruck(Truck truck);

    void removeTruck(int id);

    List<Truck> getTrucks();

}
