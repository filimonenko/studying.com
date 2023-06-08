package edu.autoservice.service.impl;
import edu.autoservice.model.Truck;
import edu.autoservice.repository.TruckRepository;
import edu.autoservice.service.TruckService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TruckServiceImpl implements TruckService {

    private final TruckRepository truckRepository;

    @Override
    public void addTruck(Truck truck) {
        truckRepository.save(truck);
    }

    @Override
    public Optional<Truck> getTruck(int id) {
        return truckRepository.findById(id);
    }

    @Override
    public void removeTruck(int id) {
        truckRepository.deleteById(id);
    }

    @Override
    public List<Truck> getTrucks() {
        return truckRepository.findAll();
    }

}
