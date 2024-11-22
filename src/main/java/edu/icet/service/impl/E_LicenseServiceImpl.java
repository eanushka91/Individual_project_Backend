package edu.icet.service.impl;

import edu.icet.dto.E_License;
import edu.icet.dto.User;
import edu.icet.entity.E_LicenseEntity;
import edu.icet.entity.UserEntity;
import edu.icet.repository.E_LicenseRepository;
import edu.icet.service.E_LicenseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class E_LicenseServiceImpl implements E_LicenseService {
    private final E_LicenseRepository repository;
    private final ModelMapper mapper;
    @Override
    public List<E_License> getAll() {
        List<E_License> e_licenseArrayList = new ArrayList<>();
        repository.findAll().forEach(entity -> {
            e_licenseArrayList.add(mapper.map(entity, E_License.class));
        });
        return e_licenseArrayList;
    }

    @Override
    public void addE_License(E_License e_license) {
        repository.save(mapper.map(e_license, E_LicenseEntity.class));
    }

    @Override
    public void deleteE_LicenseById(Integer id) {
        repository.deleteById(id);
    }


    @Override
    public void updateE_LicenseById(E_License e_license) {
        repository.save(mapper.map(e_license, E_LicenseEntity.class));
    }

    @Override
    public E_License findLicenseByLicenseNo(String licenseNo) {
        return mapper.map(repository.findLicenseByLicenseNo(licenseNo), E_License.class);
    }
}
