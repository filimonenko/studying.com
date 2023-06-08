package edu.autoservice.service;

import edu.autoservice.model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    void addClient(Client client);

    Optional<Client> getClient(int id);

    void removeClient(int id);

    List<Client> getClients();



}
