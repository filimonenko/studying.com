package edu.autoservice.controller;
import edu.autoservice.model.ServiceItem;
import edu.autoservice.service.ServiceItemService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController("/service")
@AllArgsConstructor
public class ServiceController {

    private final ServiceItemService serviceItemService;

    @GetMapping("/ServiceItems")
    public Set<ServiceItem> getServiceItems(){
        return  serviceItemService.getServices();
    }

    @GetMapping("/hi/{name}")
    public String hiAll(@PathVariable String name){
        return  "Привет " + name;
    }
}
