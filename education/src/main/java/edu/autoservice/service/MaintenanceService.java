package edu.autoservice.service;

import edu.autoservice.model.Maintenance;

import java.util.Set;

public interface MaintenanceService {

    void addMaintenance(Maintenance maintenance);

    Maintenance getMaintenance(int id);

    void removeMaintenance(int id);

    Set<Maintenance> getAllMaintenanceByPersonId(int id);
}
