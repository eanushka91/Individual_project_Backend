package edu.icet.service.impl;

import edu.icet.dto.E_License;
import edu.icet.dto.Fine;
import edu.icet.entity.FineEntity;
import edu.icet.repository.FineRepository;
import edu.icet.service.FineService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FineServiceImpl implements FineService {
    private final FineRepository repository;
    private final ModelMapper mapper;

    @Autowired
    private FineRepository fineRepository;
    @Override
    public List<Fine> getAll() {
        List<Fine> fineArrayList = new ArrayList<>();
        repository.findAll().forEach(entity -> {
            fineArrayList.add(mapper.map(entity, Fine.class));
        });
        return fineArrayList;
    }

    @Override
    public void addFine(Fine fine) {
        repository.save(mapper.map(fine, FineEntity.class));
    }

    @Override
    public void deleteFineById(Integer id) {
        repository.deleteById(id);
    }


    @Override
    public void updateFineById(Fine fine) {
        repository.save(mapper.map(fine, FineEntity.class));
    }

    @Override
    public Fine findFineByVehicleNo(String vehicleNo) {
        return mapper.map(repository.findFineByVehicleNo(vehicleNo), Fine.class);
    }
}
