package edu.autoservice.provider.impl;


import edu.autoservice.model.ServiceItem;
import edu.autoservice.model.ServiceItemType;
import edu.autoservice.provider.ServiceItemsDataProvider;

import java.util.HashSet;
import java.util.Set;

public class ServiceItemsDataProviderImpl implements ServiceItemsDataProvider {

    private static final Set<ServiceItem> SERVICE_ITEMS = new HashSet<>();

    static void fillSetServiceItems(){
        SERVICE_ITEMS.add(new ServiceItem(1010, ServiceItemType.CHASSIS_DIAGNOSTICS, 50));
        SERVICE_ITEMS.add(new ServiceItem(1111, ServiceItemType.CHASSIS_REPAIR, 100));
        SERVICE_ITEMS.add(new ServiceItem(2222, ServiceItemType.WHEEL_ALIGNMENT, 200));
        SERVICE_ITEMS.add(new ServiceItem(3333, ServiceItemType.TIMING_BELT_REPLACEMENT, 500));
        SERVICE_ITEMS.add(new ServiceItem(4444, ServiceItemType.OIL_CHANGE, 250));
    }

    @Override
    public Set<ServiceItem> getAllServiceItems() {
        if (SERVICE_ITEMS.isEmpty()) {
            fillSetServiceItems();
        }
        return SERVICE_ITEMS;

    }
}
