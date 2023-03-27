package edu.autoservice.provider;


import edu.autoservice.model.Master;

public interface MasterDataProvider {

    void saveMaster(Master master);

    Master getMaster(int id);

    void removeMaster(int id);
}
