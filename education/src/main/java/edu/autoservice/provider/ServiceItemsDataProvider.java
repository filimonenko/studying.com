package edu.autoservice.provider;

import edu.autoservice.model.ServiceItem;

import java.util.Set;

public interface ServiceItemsDataProvider {
    Set<ServiceItem> getAllServiceItems();


}
