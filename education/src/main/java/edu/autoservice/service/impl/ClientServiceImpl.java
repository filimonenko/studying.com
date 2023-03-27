package edu.autoservice.service.impl;

import edu.autoservice.model.Client;
import edu.autoservice.provider.ClientDataProvider;
import edu.autoservice.provider.impl.ClientDataProviderImpl;
import edu.autoservice.service.ClientService;

public class ClientServiceImpl implements ClientService {

    private  ClientDataProvider clientDataProvider =  new ClientDataProviderImpl();
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
