package edu.autoservice.service;

import edu.autoservice.model.ServiceItem;

import java.util.List;
import java.util.Optional;

public interface ServiceItemService {

    void addServiceItem(ServiceItem serviceItem);

    Optional<ServiceItem> getServiceItem(int id);

    void removeServiceItem(int id);

    List<ServiceItem> getServices();
}
