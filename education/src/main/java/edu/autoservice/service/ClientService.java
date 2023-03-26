package edu.autoservice.service;

import edu.autoservice.model.Client;

public interface ClientService {

    void addClient(Client client);

    Client getClient(int id);

    void removeClient(int id);

}
