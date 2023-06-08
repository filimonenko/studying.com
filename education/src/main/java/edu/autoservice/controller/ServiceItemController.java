package edu.autoservice.controller;
import edu.autoservice.model.ServiceItem;
import edu.autoservice.service.ServiceItemService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@AllArgsConstructor
public class ServiceItemController {

    private final ServiceItemService serviceItemService;

    @GetMapping("/ServiceItems")
    public List<ServiceItem> getServiceItems(){
        return  serviceItemService.getServices();
    }
}
