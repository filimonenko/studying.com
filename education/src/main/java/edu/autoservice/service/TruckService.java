package edu.autoservice.service;

import edu.autoservice.model.Truck;

public interface TruckService  {

    Truck getTruck(int id);

    void addTruck(Truck truck);

    void removeTruck(int id);

}
