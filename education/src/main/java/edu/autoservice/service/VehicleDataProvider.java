package edu.autoservice.service;

import edu.autoservice.model.Car;
import edu.autoservice.model.Vehicle;

public interface VehicleDataProvider {

    void saveVehicle(Vehicle car);

    Vehicle getVehicle(int id);

    void removeVehicle(int id);

}
