package edu.autoservice.service;

import edu.autoservice.model.Master;

import java.util.List;
import java.util.Optional;

public interface MasterService {

    void addMaster(Master master);

    Optional<Master> getMaster(int id);

    void removeMaster(int id);

    List<Master> getMasters();


}
