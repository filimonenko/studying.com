package edu.autoservice.service.impl;

import edu.autoservice.model.Master;
import edu.autoservice.service.MasterDataProvider;
import edu.autoservice.service.MasterService;
import edu.autoservice.service.CarDataProvider;

public class MasterServiceImpl implements MasterService {

    private final MasterDataProvider masterDataProvider = new MasterDataProviderImpl();

    @Override
    public void addMaster(Master master) {
        masterDataProvider.saveMaster(master);
    }

    @Override
    public Master getMaster(int id) {
        return masterDataProvider.getMaster(id);
    }

    @Override
    public void removeMaster(int id) {
        masterDataProvider.removeMaster(id);
    }
}
