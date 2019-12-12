package com.mindtree.hospitalmanagmentsystem.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.hospitalmanagmentsystem.entity.Doctor;

@Repository
public interface DoctorRepositary extends JpaRepository<Doctor,String> {

	Doctor findByDname(String dname);

}
