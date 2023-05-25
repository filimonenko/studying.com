package edu.autoservice.provider.impl;

import edu.autoservice.model.Truck;
import edu.autoservice.provider.TruckDataProvider;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
@AllArgsConstructor
public class TruckDataProviderImpl implements TruckDataProvider {

    private static final Map<Integer, Truck> TRUCKS_MAP = new HashMap<>();

    @Override
    public void saveTruck(Truck truck) {
        TRUCKS_MAP.put(truck.getId(), truck);
    }

    @Override
    public Truck getTruck(int id) {
        return TRUCKS_MAP.get(id);
    }

    @Override
    public void removeTruck(int id) {
        TRUCKS_MAP.remove(id);
    }
}
