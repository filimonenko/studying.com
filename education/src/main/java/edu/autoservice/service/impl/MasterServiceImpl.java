package edu.autoservice.service.impl;

import edu.autoservice.model.Master;
import edu.autoservice.provider.MasterDataProvider;
import edu.autoservice.provider.impl.MasterDataProviderImpl;
import edu.autoservice.service.MasterService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MasterServiceImpl implements MasterService {

    private final MasterDataProvider masterDataProvider;

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
