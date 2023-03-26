package edu.autoservice.service.impl;
import edu.autoservice.model.Car;
import edu.autoservice.service.CarService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CarServiceImplTest {

    private static CarService carService;
    private static Car testCar;


    @BeforeAll
    static void initCar(){

        carService = new CarServiceImpl();
        testCar = new Car();
        testCar.setId(1);
        System.out.println("Test -> CarServiceImpl -> Start");

    }

    @Test
    void addCar() {
        carService.addCar(testCar);
        System.out.print("Test -> CarServiceImpl -> addCar -> ");
    }

    @Test
    void getCar() {
        carService.getCar(testCar.getId());
        System.out.print("Test -> CarServiceImpl -> getCar -> ");
    }

    @Test
    void removeCar() {
        carService.removeCar(testCar.getId());
        System.out.print("Test -> CarServiceImpl -> removeCar -> ");
    }
    @AfterEach
    void getStatus(){
        System.out.println("Tested");
    }
    @AfterAll
    static void finish(){
        System.out.println("Test -> CarServiceImpl -> Finish");
    }

}