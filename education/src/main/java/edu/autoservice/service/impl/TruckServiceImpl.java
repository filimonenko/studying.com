package edu.autoservice.service.impl;
import edu.autoservice.model.Truck;
import edu.autoservice.service.TruckDataProvider;
import edu.autoservice.service.TruckService;

public class TruckServiceImpl implements TruckService {

    private final TruckDataProvider truckDataProvider = new TruckDataProviderImpl();
    @Override
    public void addTruck(Truck truck) {
        truckDataProvider.saveTruck(truck);
    }

    @Override
    public Truck getTruck(int id) {
        return truckDataProvider.getTruck(id);
    }

    @Override
    public void removeTruck(int id) {
        truckDataProvider.removeTruck(id);
    }
}
