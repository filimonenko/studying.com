package edu.autoservice.service;

import edu.autoservice.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

    void addCar(Car car);

    Optional<Car> getCar(int id);

    void removeCar(int id);

    List<Car> getCars();

}
