package edu.autoservice.service.impl;

import edu.autoservice.model.Maintenance;
import edu.autoservice.repository.MaintenanceRepository;
import edu.autoservice.service.MaintenanceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MaintenanceServiceImpl implements MaintenanceService {

    private final MaintenanceRepository maintenanceRepository;
    @Override
    public void addMaintenance(Maintenance maintenance) {
        maintenanceRepository.save(maintenance);
    }

    @Override
    public Optional<Maintenance> getMaintenance(int id) {
        return maintenanceRepository.findById(id);
    }

    @Override
    public void removeMaintenance(int id) {
        maintenanceRepository.deleteById(id);
    }

    @Override
    public List<Maintenance> getMaintenances() {
        return  maintenanceRepository.findAll();
    }


}
