package edu.icet.repository;

import edu.icet.entity.FineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FineRepository extends JpaRepository<FineEntity,Integer>{
    @Query(value = "SELECT * FROM fine WHERE vehicleno = ?1", nativeQuery = true)
    FineEntity findFineByVehicleNo(String vehicleNo);
}
