package com.mindtree.hospitalmanagmentsystem.service;

import com.mindtree.hospitalmanagmentsystem.dto.PatientDto;
import com.mindtree.hospitalmanagmentsystem.entity.Doctor;
import com.mindtree.hospitalmanagmentsystem.entity.Patient;

public interface PatientService {

	Patient assigndocter(String pname, String dname);

	//Doctor insertValues(Doctor doctor, String dname, String pname);

}
