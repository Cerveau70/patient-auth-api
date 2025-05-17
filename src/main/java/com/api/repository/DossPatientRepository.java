package com.api.repository;

import com.api.model.DossPatient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DossPatientRepository extends JpaRepository<DossPatient, Long> {
}
