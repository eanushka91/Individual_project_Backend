package edu.icet.repository;

import edu.icet.entity.E_LicenseEntity;
import edu.icet.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface E_LicenseRepository extends JpaRepository<E_LicenseEntity,Integer> {
    @Query(value = "SELECT * FROM elicense WHERE licenseno = ?1", nativeQuery = true)
    E_LicenseEntity findLicenseByLicenseNo(String licenseNo);
}
