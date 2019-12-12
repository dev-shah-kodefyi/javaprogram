package com.mindtree.hospitalmanagmentsystem.service;

import java.util.List;

import com.mindtree.hospitalmanagmentsystem.dto.DoctorDto;
import com.mindtree.hospitalmanagmentsystem.entity.Doctor;
import com.mindtree.hospitalmanagmentsystem.entity.Patient;

public interface DoctorService {

	List<Doctor> getDetails();

	//List<Doctor> getAllByExp();

	

//	DoctorDto insertValues(DoctorDto doctor);
//
//	Object getPatientByDocName(String dname);
//
//	List<DoctorDto> getAllDoctor();

}
