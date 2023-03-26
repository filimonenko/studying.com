package edu.autoservice.service.impl;

import edu.autoservice.model.Client;
import edu.autoservice.service.ClientDataProvider;
import edu.autoservice.service.ClientService;
import edu.autoservice.service.CarDataProvider;

public class ClientServiceImpl implements ClientService {

    private final ClientDataProvider clientDataProvider =  new ClientDataProviderImpl ();
    @Override
    public void addClient(Client client) {
        clientDataProvider.saveClient(client);
    }

    @Override
    public Client getClient(int id) {
        return clientDataProvider.getClient(id);
    }

    @Override
    public void removeClient(int id) {
        clientDataProvider.removeClient(id);
    }
}
