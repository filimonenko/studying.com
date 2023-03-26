package edu.autoservice.service.impl;

import edu.autoservice.model.Master;
import edu.autoservice.service.MasterService;
import edu.autoservice.service.PersonDataProvider;

public class MasterServiceImpl implements MasterService {

    private PersonDataProvider personDataProvider = new PersonDataProviderImpl();
    @Override
    public void addMaster(Master master) {
        personDataProvider.savePerson(master);
    }

    @Override
    public Master getMaster(int id) {
        return (Master) personDataProvider.getPerson(id);
    }

    @Override
    public void removeMaster(int id) {
        personDataProvider.removePerson(id);
    }
}
