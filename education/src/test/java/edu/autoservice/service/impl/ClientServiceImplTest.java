package edu.autoservice.service.impl;

import edu.autoservice.model.Client;
import edu.autoservice.service.ClientService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ClientServiceImplTest {

    private static ClientService clientService ;
    private static Client testClient;
    private static int clientId = 3;


    @BeforeAll
    static void initClient(){
        clientService = new ClientServiceImpl();
        testClient = new Client();
        testClient.setId(clientId);
        System.out.println("Test -> ClientServiceImpl -> Start");
    }

    @Test
    void addClient(){
        clientService.addClient(testClient);
        System.out.print("Test -> ClientServiceImpl -> addClient -> ");
    }

    @Test
    void getClient(){
        clientService.getClient(clientId);
        System.out.print("Test -> ClientServiceImpl -> getClient -> ");
    }

    @Test
    void removeClient(){
        clientService.removeClient(clientId);
        System.out.print("Test -> ClientServiceImpl -> removeClient -> ");
    }

    @AfterEach
    void getStatus(){
        System.out.println("Tested");
    }
    @AfterAll
    static void finish(){
        System.out.println("Test -> ClientServiceImpl -> Finish");
    }

}
