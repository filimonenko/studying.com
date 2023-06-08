package edu.autoservice.service;

import edu.autoservice.model.Maintenance;

import java.util.List;
import java.util.Optional;

public interface MaintenanceService {

    void addMaintenance(Maintenance maintenance);

    Optional<Maintenance> getMaintenance(int id);

    void removeMaintenance(int id);

    List<Maintenance> getMaintenances();
}
