package edu.autoservice.service.impl;

import edu.autoservice.model.Car;
import edu.autoservice.model.Vehicle;
import edu.autoservice.service.VehicleDataProvider;
import edu.autoservice.service.CarService;

public class CarServiceImpl implements CarService {

    private VehicleDataProvider vehicleDataProvider = new VehicleDataProviderImpl();

    @Override
    public void addCar(Car car) {
        vehicleDataProvider.saveVehicle(car);
    }
    @Override
    public void removeCar(int id) {
        vehicleDataProvider.removeVehicle(id);
    }
    @Override
    public Car getCar(int id) {
        return(Car)vehicleDataProvider.getVehicle(id);
    }

}
