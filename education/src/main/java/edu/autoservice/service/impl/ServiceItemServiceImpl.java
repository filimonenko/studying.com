package edu.autoservice.service.impl;

import edu.autoservice.model.ServiceItem;
import edu.autoservice.repository.ServiceItemsRepository;
import edu.autoservice.service.ServiceItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServiceItemServiceImpl implements ServiceItemService {

    private final ServiceItemsRepository serviceItemsRepository;

    @Override
    public void addServiceItem(ServiceItem serviceItem) {
        serviceItemsRepository.save(serviceItem);
    }

    @Override
    public Optional<ServiceItem> getServiceItem(int id) {
        return serviceItemsRepository.findById(id);
    }

    @Override
    public void removeServiceItem(int id) {
        serviceItemsRepository.deleteById(id);
    }

    @Override
    public List<ServiceItem> getServices() {
        return serviceItemsRepository.findAll();
    }
}
