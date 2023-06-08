package edu.autoservice.service.impl;
import edu.autoservice.model.Car;
import edu.autoservice.repository.CarRepository;
import edu.autoservice.service.CarService;
import org.junit.jupiter.api.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("CarService class test")
class CarServiceImplTest {

    private static CarRepository carRepository;
    private static CarService carService;
    private static Car testCar;
    private static final int CAR_ID = 1;


    @BeforeAll
    static void initCar(){
        carService = new CarServiceImpl(carRepository);
        testCar = new Car();
        testCar.setId(CAR_ID);
    }

    @BeforeEach
    void addCarEach(){
        carService.addCar(testCar);
    }

    @Test
    @DisplayName("add car")
    void addCar() {
        assertEquals(getActualCar(), testCar);
    }

    @Test
    @DisplayName("get car")
    void getCar() {
        assertEquals(getActualCar(), testCar);
    }

    @Test
    @DisplayName("removed car")
    void removeCar() {
        carService.removeCar(CAR_ID);
        assertNull(getActualCar());
    }

    private static Optional<Car> getActualCar(){
        return carService.getCar(CAR_ID);
    }

}