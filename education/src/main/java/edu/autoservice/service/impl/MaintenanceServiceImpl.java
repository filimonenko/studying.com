package edu.autoservice.service.impl;

import edu.autoservice.model.Maintenance;
import edu.autoservice.provider.MaintenanceDataProvider;
import edu.autoservice.service.MaintenanceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
public class MaintenanceServiceImpl implements MaintenanceService {

    private  final MaintenanceDataProvider maintenanceDataProvider;
    @Override
    public void addMaintenance(Maintenance maintenance) {
        maintenanceDataProvider.saveMaintenance(maintenance);
    }

    @Override
    public Maintenance getMaintenance(int id) {
        return maintenanceDataProvider.getMaintenance(id);
    }

    @Override
    public void removeMaintenance(int id) {
        maintenanceDataProvider.removeMaintenance(id);
    }

    @Override
    public Set<Maintenance> getAllMaintenanceByClientId(int id) {
        return maintenanceDataProvider.getAllMaintenanceByClientId(id);
    }


}
