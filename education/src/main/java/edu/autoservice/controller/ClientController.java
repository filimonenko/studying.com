package edu.autoservice.controller;

import edu.autoservice.model.Client;
import edu.autoservice.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/Clients")
    public List<Client> getAll() {
        return  clientService.getClients();
    }
}
