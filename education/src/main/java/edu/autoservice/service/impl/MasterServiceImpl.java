package edu.autoservice.service.impl;

import edu.autoservice.model.Master;
import edu.autoservice.repository.MasterRepository;
import edu.autoservice.service.MasterService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MasterServiceImpl implements MasterService {

    private final MasterRepository masterRepository;

    @Override
    public void addMaster(Master master) {
        masterRepository.save(master);
    }

    @Override
    public Optional<Master> getMaster(int id) {
        return masterRepository.findById(id);
    }

    @Override
    public void removeMaster(int id) {
        masterRepository.deleteById(id);
    }

    @Override
    public List<Master> getMasters() {
        return masterRepository.findAll();
    }
}
