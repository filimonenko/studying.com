package edu.autoservice.service.impl;

import edu.autoservice.model.Master;
import edu.autoservice.provider.MasterDataProvider;
import edu.autoservice.provider.impl.MasterDataProviderImpl;
import edu.autoservice.service.MasterService;

public class MasterServiceImpl implements MasterService {

    private  MasterDataProvider masterDataProvider = new MasterDataProviderImpl();

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
