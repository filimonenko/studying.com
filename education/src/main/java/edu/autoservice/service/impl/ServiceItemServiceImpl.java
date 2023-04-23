package edu.autoservice.service.impl;

import edu.autoservice.model.ServiceItem;
import edu.autoservice.provider.ServiceItemsDataProvider;
import edu.autoservice.provider.impl.ServiceItemsDataProviderImpl;
import edu.autoservice.service.ServiceItemService;

import java.util.Set;

public class ServiceItemServiceImpl implements ServiceItemService {

    private final ServiceItemsDataProvider serviceItemsDataProvider = new ServiceItemsDataProviderImpl();
    @Override
    public Set<ServiceItem> getServices() {
        return serviceItemsDataProvider.getAllServiceItems();
    }
}
