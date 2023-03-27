package edu.autoservice.service;

import edu.autoservice.model.Truck;

public interface TruckDataProvider {

    void saveTruck(Truck truck);

    Truck getTruck(int id);

    void removeTruck(int id);

}