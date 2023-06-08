package edu.autoservice.service.impl;

import edu.autoservice.model.Car;
import edu.autoservice.repository.CarRepository;
import edu.autoservice.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    @Override
    public void addCar(Car car) {
        carRepository.save(car);
    }
    @Override
    public Optional<Car> getCar(int id) {
        return carRepository.findById(id);
    }
    @Override
    public void removeCar(int id) {
        carRepository.deleteById(id);
    }

    @Override
    public List<Car> getCars() {
        return carRepository.findAll();
    }

}
