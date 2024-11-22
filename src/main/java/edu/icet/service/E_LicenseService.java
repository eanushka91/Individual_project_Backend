package edu.icet.service;

import edu.icet.dto.E_License;
import edu.icet.entity.E_LicenseEntity;

import java.util.List;

public interface E_LicenseService {
    List<E_License> getAll();
    void addE_License(E_License e_license);
    void deleteE_LicenseById(Integer id);
//    E_License searchE_LicenseById(Integer id);
    void updateE_LicenseById(E_License e_license);
    E_License findLicenseByLicenseNo(String licenseNo);
}
