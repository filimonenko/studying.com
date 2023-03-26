package edu.autoservice.service.impl;

import edu.autoservice.model.Master;
import edu.autoservice.service.MasterService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MasterServiceTest {

    private static MasterService masterService;
    private static Master testMaster;
    private static int masterId = 3;


    @BeforeAll
    static void initMaster(){
        masterService = new MasterServiceImpl();
        testMaster = new Master();
        testMaster.setId(masterId);
        System.out.println("Test -> MasterServiceImpl -> Start");
    }

    @Test
    void addMaster(){
        masterService.addMaster(testMaster);
        System.out.print("Test -> MasterServiceImpl -> addMaster -> ");
    }

    @Test
    void getMaster(){
        masterService.getMaster(masterId);
        System.out.print("Test -> MasterServiceImpl -> getMaster -> ");
    }

    @Test
    void removeMaster(){
        masterService.removeMaster(masterId);
        System.out.print("Test -> MasterServiceImpl -> removeMaster -> ");
    }

    @AfterEach
    void getStatus(){
        System.out.println("Tested");
    }
    @AfterAll
    static void finish(){
        System.out.println("Test -> MasterServiceImpl -> Finish");
    }
}
