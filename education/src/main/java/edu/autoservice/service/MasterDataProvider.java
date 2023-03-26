package edu.autoservice.service;


import edu.autoservice.model.Master;

public interface MasterDataProvider {

    void saveMaster(Master master);

    Master getMaster(int id);

    void removeMaster(int id);
}
