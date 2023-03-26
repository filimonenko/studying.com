package edu.autoservice.service.impl;

import edu.autoservice.model.Car;
import edu.autoservice.model.Person;
import edu.autoservice.service.CarDataProvider;

import java.util.HashMap;
import java.util.Map;

public class CarDataProviderImpl implements CarDataProvider {

    private static final Map<Integer, Car> CARS_MAP = new HashMap<>();

    @Override
    public void saveCar(Car car) {
        CARS_MAP.put(car.getId(),car);
    }

    @Override
    public Car getCar(int id) {
        return CARS_MAP.get(id);
    }

    @Override
    public void removeCar(int id) {
        CARS_MAP.remove(id);
    }
}
