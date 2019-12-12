package com.mindtree.hospitalmanagmentsystem.controller;

import java.util.List;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.hospitalmanagmentsystem.dto.DoctorDto;
import com.mindtree.hospitalmanagmentsystem.dto.PatientDto;
import com.mindtree.hospitalmanagmentsystem.entity.Doctor;
import com.mindtree.hospitalmanagmentsystem.entity.Patient;
import com.mindtree.hospitalmanagmentsystem.service.DoctorService;
import com.mindtree.hospitalmanagmentsystem.service.PatientService;

@RestController
public class AppRunner {

	@Autowired
	PatientService patientService;
	
	@Autowired
	DoctorService doctorService;
	
//	@PostMapping("/insert")
//	public ResponseEntity<DoctorDto>insertValue(@RequestBody DoctorDto doctor)
//	{
//		DoctorDto doc=doctorService.insertValues(doctor);
//		
//		return ResponseEntity.status(HttpStatus.OK).body(doc);
//
//	}
//	
//	@GetMapping("/getPatients")
//	public ResponseEntity<Object> getPatientById(@RequestParam("dname") String dname) throws ServiceException {
//		
//		return ResponseEntity.status(HttpStatus.OK).body(doctorService.getPatientByDocName(dname));
//	}
	
//	@GetMapping("/finddoc")
//	public ResponseEntity<List<DoctorDto>> getAllDoc()
//	{
//		List<DoctorDto>d1=doctorService.getAllDoctor();
//		
//		return ResponseEntity.status(HttpStatus.OK).body(d1);
//		
//	}
//	
//	
	
	@PostMapping("/assigndoctor/{pname}/{dname}")
	public ResponseEntity<Patient> assigndoc(@PathVariable String pname,@PathVariable String dname)
	{
		Patient patient=patientService.assigndocter(pname,dname);
		
		return ResponseEntity.status(HttpStatus.OK).body(patient);
		
		
	}
	
//	@PostMapping("/assigndoctor/{pname}/{dname}")
//	public Patient assign(@PathVariable String pname,@PathVariable String dname)
//	{
//		return patientService.assigndocter(pname, dname);
//		
//	}
//	
	@GetMapping("/displaydocSalary")
	public List<Doctor> display()
	{
		return doctorService.getDetails();
		
	}
	
//	@GetMapping("displaydocExperience")
//	public List<Doctor> disp()
//	{
//		return doctorService.getAllByExp();
//	}
//	
}
