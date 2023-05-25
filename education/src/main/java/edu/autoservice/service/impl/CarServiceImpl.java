package edu.autoservice.service.impl;

import edu.autoservice.model.Car;
import edu.autoservice.provider.CarDataProvider;
import edu.autoservice.provider.impl.CarDataProviderImpl;
import edu.autoservice.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarDataProvider carDataProvider;
    @Override
    public void addCar(Car car) {
        carDataProvider.saveCar(car);
    }
    @Override
    public Car getCar(int id) {
        return(Car) carDataProvider.getCar(id);
    }
    @Override
    public void removeCar(int id) {
        carDataProvider.removeCar(id);
    }

}
