package edu.autoservice.service.impl;

import edu.autoservice.model.Master;
import edu.autoservice.repository.MasterRepository;
import edu.autoservice.service.MasterService;
import org.junit.jupiter.api.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("MasterService class test")
public class MasterServiceTest {

    private static MasterRepository masterRepository;
    private static MasterService masterService;
    private static Master testMaster;
    private static final int MASTER_ID = 3;


    @BeforeAll
    static void initMaster(){
        masterService = new MasterServiceImpl(masterRepository);
        testMaster = new Master();
        testMaster.setId(MASTER_ID);
    }

    @BeforeEach
    void addMasterEach(){
        masterService.addMaster(testMaster);
    }

    @Test
    @DisplayName("add master")
    void addMaster(){
        assertEquals(getActualMaster(), testMaster);
    }

    @Test
    @DisplayName("get master")
    void getMaster(){
        assertEquals(getActualMaster(), testMaster);
    }

    @Test
    @DisplayName("removed master")
    void removeMaster(){
        masterService.removeMaster(MASTER_ID);
        assertNull(getActualMaster());
    }

    private static Optional<Master> getActualMaster(){
        return masterService.getMaster(MASTER_ID);
    }
}
