package edu.autoservice.service;

import edu.autoservice.model.Master;

public interface MasterService {

    void addMaster(Master master);

    Master getMaster(int id);

    void removeMaster(int id);


}
