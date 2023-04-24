package edu.autoservice.provider;

import edu.autoservice.model.Maintenance;

import java.util.Set;

public interface MaintenanceDataProvider {

    void saveMaintenance(Maintenance maintenance);

    Maintenance getMaintenance(int id);

    void removeMaintenance(int id);

    Set<Maintenance> getAllMaintenanceByClientId(int id);

}
