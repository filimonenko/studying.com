package edu.autoservice.service.impl;
import edu.autoservice.model.Truck;
import edu.autoservice.provider.TruckDataProvider;
import edu.autoservice.service.TruckService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TruckServiceImpl implements TruckService {

    private final  TruckDataProvider truckDataProvider;

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
