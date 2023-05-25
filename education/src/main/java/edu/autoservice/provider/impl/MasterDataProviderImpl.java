package edu.autoservice.provider.impl;

import edu.autoservice.model.Master;
import edu.autoservice.provider.MasterDataProvider;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
@AllArgsConstructor
public class MasterDataProviderImpl implements MasterDataProvider {

    private static final Map<Integer, Master> MASTERS_MAP = new HashMap<>();

    @Override
    public void saveMaster(Master master) {
        MASTERS_MAP.put(master.getId(), master);
    }

    @Override
    public Master getMaster(int id) {
        return MASTERS_MAP.get(id);
    }

    @Override
    public void removeMaster(int id) {
        MASTERS_MAP.remove(id);

    }
}
