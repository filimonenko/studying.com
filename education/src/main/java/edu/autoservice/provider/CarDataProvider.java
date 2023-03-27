package edu.autoservice.provider;

import edu.autoservice.model.Car;

public interface CarDataProvider {

    void saveCar(Car car);

    Car getCar(int id);

    void removeCar(int id);

}
