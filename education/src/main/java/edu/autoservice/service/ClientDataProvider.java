package edu.autoservice.service;


import edu.autoservice.model.Client;

public interface ClientDataProvider {

    void saveClient(Client client);

    Client getClient(int id);

    void removeClient(int id);
}
