package edu.autoservice.service.impl;

import edu.autoservice.model.Client;
import edu.autoservice.repository.ClientRepository;
import edu.autoservice.service.ClientService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("ClientService class test")
public class ClientServiceImplTest {

    private static ClientRepository clientRepository;
    private static ClientService clientService ;
    private static Client testClient;
    private static final int CLIENT_ID = 3;


    @BeforeAll
    static void initClient(){
        clientService = new ClientServiceImpl(clientRepository);
        testClient = new Client();
        testClient.setId(CLIENT_ID);
    }

    @BeforeEach
    void addClientEach(){
        clientService.addClient(testClient);
    }

    @Test
    @DisplayName("add client")
    void addClient(){
        assertEquals(testClient, getActualClient());
    }

    @Test
    @DisplayName("get client")
    void getClient(){
        assertEquals(testClient, getActualClient());
    }

    @Test
    @DisplayName("removed client")
    void removeClient(){
        clientService.removeClient(CLIENT_ID);
        assertNull(getActualClient());
    }

    private static Optional<Client> getActualClient(){
        return clientService.getClient(CLIENT_ID);
    }
}
