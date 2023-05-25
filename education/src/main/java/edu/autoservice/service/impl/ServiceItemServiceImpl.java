package edu.autoservice.service.impl;

import edu.autoservice.model.ServiceItem;
import edu.autoservice.provider.ServiceItemsDataProvider;
import edu.autoservice.provider.impl.ServiceItemsDataProviderImpl;
import edu.autoservice.service.ServiceItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
@AllArgsConstructor
public class ServiceItemServiceImpl implements ServiceItemService {

    private final ServiceItemsDataProvider serviceItemsDataProvider;
    @Override
    public Set<ServiceItem> getServices() {
        return serviceItemsDataProvider.getAllServiceItems();
    }
}
