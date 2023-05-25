package edu.autoservice.provider.impl;

import edu.autoservice.model.Maintenance;
import edu.autoservice.provider.MaintenanceDataProvider;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
@AllArgsConstructor
public class MaintenanceDataProviderImpl implements MaintenanceDataProvider {

    private static final Map<Integer, Maintenance> MAINTENANCE_MAP = new HashMap<>();
    @Override
    public void saveMaintenance(Maintenance maintenance) {
        MAINTENANCE_MAP.put(maintenance.getId(), maintenance);
    }

    @Override
    public Maintenance getMaintenance(int id) {
        return MAINTENANCE_MAP.get(id);
    }

    @Override
    public void removeMaintenance(int id) {
        MAINTENANCE_MAP.remove(id);
    }

    @Override
    public Set<Maintenance> getAllMaintenanceByClientId(int id) {

        Set<Maintenance> maintenances = new HashSet<>();

        for (Map.Entry<Integer, Maintenance> entry : MAINTENANCE_MAP.entrySet()) {
            if (entry.getValue().getClient().getId() == id) {
                maintenances.add(entry.getValue());
            }
        }
        return maintenances;
    }


}
