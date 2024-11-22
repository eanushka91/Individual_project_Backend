package edu.icet.service;

import edu.icet.dto.E_License;
import edu.icet.dto.Fine;

import java.util.List;

public interface FineService {
    List<Fine> getAll();
    void addFine(Fine fine);
    void deleteFineById(Integer id);
//    Fine searchFineById(Integer id);
    void updateFineById(Fine fine);
    Fine findFineByVehicleNo(String vehicleNo);
}
