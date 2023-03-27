package edu.autoservice.service.impl;
import edu.autoservice.model.Car;
import edu.autoservice.model.Vehicle;
import edu.autoservice.service.CarService;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("CarService class test")
class CarServiceImplTest {

    private static CarService carService;
    private static Car testCar;


    @BeforeAll
    static void initCar(){
        carService = new CarServiceImpl();
        testCar = new Car();
        testCar.setId(1);
    }

    @Test
    @DisplayName("add car test")
    void addCar() {
        carService.addCar(testCar);
        Car actual = carService.getCar(testCar.getId());
        assertEquals(actual, testCar);
    }

    @Test
    @DisplayName("get car test")
    void getCar() {
        carService.addCar(testCar);
        Car actual = carService.getCar(testCar.getId());
        assertEquals(actual, actual);
    }

    @Test
    @DisplayName("remove car test")
    void removeCar() {
        carService.addCar(testCar);
        carService.removeCar(testCar.getId());
        assertNull(carService.getCar(testCar.getId()));
    }

}