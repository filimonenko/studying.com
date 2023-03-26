package edu.autoservice.service.impl;

import edu.autoservice.model.Client;
import edu.autoservice.service.ClientDataProvider;

import java.util.HashMap;
import java.util.Map;

public class ClientDataProviderImpl implements ClientDataProvider {

    private static final Map<Integer, Client> CLIENTS_MAP = new HashMap<>();

    @Override
    public void saveClient(Client client) {
        CLIENTS_MAP.put(client.getId(), client);
    }

    @Override
    public Client getClient(int id) {
        return CLIENTS_MAP.get(id);
    }

    @Override
    public void removeClient(int id) {
        CLIENTS_MAP.remove(id);
    }
}
