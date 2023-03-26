package edu.autoservice.service.impl;

import edu.autoservice.model.Truck;
import edu.autoservice.service.TruckService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TruckServiceImplTest {

    private static TruckService truckService;
    private static Truck testTruck;

    @BeforeAll
    static void initTrack(){

        truckService = new TruckServiceImpl();
        testTruck = new Truck();
        testTruck.setId(2);
        System.out.println("Test -> TruckServiceImpl -> Start");
    }

    @Test
   void addCar(){
        truckService.addTruck(testTruck);
        System.out.print("Test -> TruckServiceImpl -> addTruck -> ");
   }

    @Test
    void getCar(){
        truckService.getTruck(testTruck.getId());
        System.out.print("Test -> TruckServiceImpl -> getTruck -> ");
    }

    @Test
    void removeCar(){
        truckService.removeTruck(testTruck.getId());
        System.out.print("Test -> TruckServiceImpl -> removeTruck -> ");
    }

    @AfterEach
    void getStatus(){
        System.out.println("Tested");
    }

    @AfterAll
    static void finish(){
        System.out.println("Test -> TruckServiceImpl -> Finish");
    }


}
