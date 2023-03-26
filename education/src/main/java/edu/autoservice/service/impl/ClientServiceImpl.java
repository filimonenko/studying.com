package edu.autoservice.service.impl;

import edu.autoservice.model.Client;
import edu.autoservice.service.ClientService;
import edu.autoservice.service.PersonDataProvider;

public class ClientServiceImpl implements ClientService {

    private PersonDataProvider personDataProvider  =  new PersonDataProviderImpl();
    @Override
    public Client getClient(int id) {
        return (Client) personDataProvider.getPerson(id);
    }

    @Override
    public void addClient(Client client) {
        personDataProvider.savePerson(client);
    }

    @Override
    public void removeClient(int id) {
        personDataProvider.removePerson(id);
    }
}
