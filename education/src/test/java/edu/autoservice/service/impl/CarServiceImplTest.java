package edu.autoservice.service.impl;
import edu.autoservice.model.Car;
import edu.autoservice.model.Vehicle;
import edu.autoservice.service.CarService;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarServiceImplTest {

    private static CarService carService;
    private static Car testCar;


    @BeforeAll
    static void initCar(){
        carService = new CarServiceImpl();
        testCar = new Car();
        Vehicle testCar1 = new Car();

        testCar.setId(1);
    }

    @Test
    @DisplayName("adding Car test")
    void addCar() {
        carService.addCar(testCar);
        Car actual = carService.getCar(testCar.getId());
        assertEquals(actual, testCar);
    }

    @Test
    void getCar() {
        carService.addCar(testCar);
        carService.getCar(testCar.getId());

    }

    @Test
    void removeCar() {
        carService.removeCar(testCar.getId());
    }

    @AfterAll
    static void finish(){
        System.out.println("Test -> CarServiceImpl -> Finish");
    }

}