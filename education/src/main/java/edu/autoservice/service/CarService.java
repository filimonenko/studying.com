package edu.autoservice.service;

import edu.autoservice.model.Car;

public interface CarService {

    void addCar(Car car);

    Car getCar(int id);

    void removeCar(int id);
}
