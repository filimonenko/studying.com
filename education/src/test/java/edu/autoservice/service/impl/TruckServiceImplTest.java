package edu.autoservice.service.impl;

import edu.autoservice.model.Truck;
import edu.autoservice.repository.TruckRepository;
import edu.autoservice.service.TruckService;
import org.junit.jupiter.api.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


@DisplayName("TruckService class test")
public class TruckServiceImplTest {

    private static TruckRepository truckRepository;
    private static TruckService truckService;
    private static Truck testTruck;
    private static final int TRUCK_ID = 2;

    @BeforeAll
    static void initTrack(){
        truckService = new TruckServiceImpl(truckRepository);
        testTruck = new Truck();
        testTruck.setId(TRUCK_ID);
    }

    @BeforeEach
    void addTruckEach(){
        truckService.addTruck(testTruck);
    }

    @Test
    @DisplayName("add truck")
   void addTruck(){
        assertEquals(getActualTruck(), testTruck);
   }

    @Test
    @DisplayName("get truck")
    void getTruck(){
        assertEquals(getActualTruck(), testTruck);
    }

    @Test
    @DisplayName("removed truck")
    void removeTruck(){
        truckService.removeTruck(TRUCK_ID);
        assertNull(getActualTruck());
    }

    private static Optional<Truck> getActualTruck(){
        return truckService.getTruck(TRUCK_ID);
    }
}
