package com.mindtree.hospitalmanagmentsystem.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.hospitalmanagmentsystem.dto.PatientDto;
import com.mindtree.hospitalmanagmentsystem.entity.Doctor;
import com.mindtree.hospitalmanagmentsystem.entity.Patient;
import com.mindtree.hospitalmanagmentsystem.repositary.DoctorRepositary;
import com.mindtree.hospitalmanagmentsystem.repositary.PatientRepositary;
import com.mindtree.hospitalmanagmentsystem.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	DoctorRepositary doctorRepositary;
	
	@Autowired
	PatientRepositary patientRepositary;
	
	
	@Override
	public Patient assigndocter(String pname, String dname) {
		
		Patient patient=(Patient)patientRepositary.findByPname(pname);
		Doctor doctor=(Doctor)doctorRepositary.findByDname(dname);
		patient.setDoctor(doctor);
		doctor.setDsalary(doctor.getDsalary()+patient.getPbill());
		
		return patientRepositary.save(patient);
		
	}

}
