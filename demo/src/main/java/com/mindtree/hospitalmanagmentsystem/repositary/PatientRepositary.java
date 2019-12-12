package com.mindtree.hospitalmanagmentsystem.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.hospitalmanagmentsystem.entity.Patient;

@Repository
public interface PatientRepositary extends JpaRepository<Patient,String> {

	Patient findByPname(String pname);

}
