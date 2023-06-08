package edu.autoservice.service.impl;

import edu.autoservice.model.Client;
import edu.autoservice.repository.ClientRepository;
import edu.autoservice.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    @Override
    public void addClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public Optional<Client> getClient(int id) {
        return clientRepository.findById(id);
    }

    @Override
    public void removeClient(int id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

}
