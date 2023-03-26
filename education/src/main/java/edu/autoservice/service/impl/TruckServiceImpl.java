package edu.autoservice.service.impl;

import edu.autoservice.model.Truck;
import edu.autoservice.service.TruckService;
import edu.autoservice.service.VehicleDataProvider;

public class TruckServiceImpl implements TruckService {

    private VehicleDataProvider vehicleDataProvider = new VehicleDataProviderImpl();
    @Override
    public Truck getTruck(int id) {
        return (Truck) vehicleDataProvider.getVehicle(id);
    }

    @Override
    public void addTruck(Truck truck) {
        vehicleDataProvider.saveVehicle(truck);
    }

    @Override
    public void removeTruck(int id) {
        vehicleDataProvider.removeVehicle(id);
    }
}
