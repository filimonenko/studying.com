package edu.autoservice.service.impl;

import edu.autoservice.model.Maintenance;
import edu.autoservice.provider.MaintenanceDataProvider;
import edu.autoservice.provider.impl.MaintenanceDataProviderImpl;
import edu.autoservice.service.MaintenanceService;

import java.util.Set;

public class MaintenanceServiceImpl implements MaintenanceService {

    private static final MaintenanceDataProvider MAINTENANCE_DATA_PROVIDER = new MaintenanceDataProviderImpl();
    @Override
    public void addMaintenance(Maintenance maintenance) {
        MAINTENANCE_DATA_PROVIDER.saveMaintenance(maintenance);
    }

    @Override
    public Maintenance getMaintenance(int id) {
        return MAINTENANCE_DATA_PROVIDER.getMaintenance(id);
    }

    @Override
    public void removeMaintenance(int id) {
        MAINTENANCE_DATA_PROVIDER.removeMaintenance(id);
    }

    @Override
    public Set<Maintenance> getAllMaintenanceByClientId(int id) {
        return MAINTENANCE_DATA_PROVIDER.getAllMaintenanceByClientId(id);
    }


}
