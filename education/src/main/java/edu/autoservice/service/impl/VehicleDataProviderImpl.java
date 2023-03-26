package edu.autoservice.service.impl;

import edu.autoservice.model.Car;
import edu.autoservice.model.Vehicle;
import edu.autoservice.service.VehicleDataProvider;

import java.util.HashMap;
import java.util.Map;

public class VehicleDataProviderImpl implements VehicleDataProvider {

    private static final Map<Integer, Vehicle> VEHICLES = new HashMap<>();

    @Override
    public void saveVehicle(Vehicle vehicle) {
        VEHICLES.put(vehicle.getId(), vehicle);
    }

    @Override
    public Vehicle getVehicle(int id) {
        return VEHICLES.get(id);
    }

    @Override
    public void removeVehicle(int id) {
        VEHICLES.remove(id);
    }
}
