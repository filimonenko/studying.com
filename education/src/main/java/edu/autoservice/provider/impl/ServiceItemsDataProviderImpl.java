package edu.autoservice.provider.impl;


import edu.autoservice.model.ServiceItem;
import edu.autoservice.model.ServiceItemType;
import edu.autoservice.provider.ServiceItemsDataProvider;

import java.util.HashSet;
import java.util.Set;

public class ServiceItemsDataProviderImpl implements ServiceItemsDataProvider {

    private static final Set<ServiceItem> SET_OF_SERVICE_ITEMS = new HashSet<>();

    static void fillSetServiceItems(){
        SET_OF_SERVICE_ITEMS.add(new ServiceItem(1010, ServiceItemType.ChassisDiagnostics, 50));
        SET_OF_SERVICE_ITEMS.add(new ServiceItem(1111, ServiceItemType.ChassisRepair, 100));
        SET_OF_SERVICE_ITEMS.add(new ServiceItem(2222, ServiceItemType.WheelAlignment, 200));
        SET_OF_SERVICE_ITEMS.add(new ServiceItem(3333, ServiceItemType.TimingBeltReplacement, 500));
        SET_OF_SERVICE_ITEMS.add(new ServiceItem(4444, ServiceItemType.OilChange, 250));
    }

    @Override
    public Set<ServiceItem> getAllServiceItems() {
        if (SET_OF_SERVICE_ITEMS.isEmpty()) {
            fillSetServiceItems();
        }
        return SET_OF_SERVICE_ITEMS;

    }
}
