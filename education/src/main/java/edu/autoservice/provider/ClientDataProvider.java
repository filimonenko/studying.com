package edu.autoservice.provider;


import edu.autoservice.model.Client;

public interface ClientDataProvider {

    void saveClient(Client client);

    Client getClient(int id);

    void removeClient(int id);
}
