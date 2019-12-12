package com.mindtree.hospitalmanagmentsystem.service.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.mapping.Collection;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.mindtree.hospitalmanagmentsystem.dto.DoctorDto;
import com.mindtree.hospitalmanagmentsystem.dto.PatientDto;
import com.mindtree.hospitalmanagmentsystem.entity.Doctor;
import com.mindtree.hospitalmanagmentsystem.entity.Patient;
import com.mindtree.hospitalmanagmentsystem.repositary.DoctorRepositary;
import com.mindtree.hospitalmanagmentsystem.repositary.PatientRepositary;
import com.mindtree.hospitalmanagmentsystem.service.DoctorService;
@Service
public class DoctorServiceImpl implements DoctorService {

	

	@Autowired
	DoctorRepositary doctorRepositary;
	
	@Autowired
	PatientRepositary patientRepositary;
	
	
	public List<Doctor> getDetails() {
		
		List<Doctor>doclist=doctorRepositary.findAll();
		
		SalaryCompare salary=new SalaryCompare();
		
		Collections.sort(doclist,salary);
		
		return doclist;
	}


	
//	public List<Doctor> getAllByExp() {
//		
//		List<Doctor> listdoc=doctorRepositary.findAll();
//		
//		List<Doctor>result=new ArrayList<>();
//		
//		ExpCompare expr=new ExpCompare();
//		
//		for(Doctor d:listdoc)
//		{
//			if(d.getPatientlist().size()>2)
//			{
//				result.add(d);			}
//		}
//		Collections.sort(result,expr );
//		
//		
//		
//		
//		
//		return result;
//	}
//	
	
	//private ModelMapper modelMapper = new ModelMapper();
	
//	@Bean
//	public ModelMapper Mapper() {
//		return new ModelMapper();
//
//	}
	//@Autowired
	//ModelMapper mapper;

	
//	@Override
//	public Doctor insertValues(String dname, String pname) {
//		
//		Doctor doctor=new Doctor();
//		
//		Doctor doc=doctorRepositary.findByDname(dname);
//		Patient pat=patientRepositary.findByPname(pname);
//		List<Patient> list=new ArrayList<>();
//		
//		doc.setDid(doctor.getDid());
//		
//		doc.setDexperience(doctor.getDexperience());
//		doc.setDname(dname);
//		doc.setDsalary(pat.getPbill());
//		
//		if (doctor.getPatientlist() != null) {
//			for(Patient p: doctor.getPatientlist())
//			{
//			pat.setPbill(p.getPbill());
//			pat.setPid(p.getPbill());
//			pat.setPname(p.getPname());
//			list.add(pat);
//			}
//		
//		doc.setPatientlist(list);}
//		
//		
//         return doctorRepositary.save(doc);
//		
//	}

//	@Override
//	public DoctorDto insertValues(DoctorDto doctor) {
//		Doctor doctorentity=new Doctor();
//		Patient patiententity=new Patient();
//		List<Doctor> doctorlist=new ArrayList<>();
//		List<Patient> patientlist=new ArrayList<>();
//		
//		doctorentity.setDid(doctor.getDid());
//		doctorentity.setDname(doctor.getDname());
//		doctorentity.setDsalary(doctor.getDsalary());
//		doctorentity.setDexperience(doctor.getDexperience());
//		doctorlist.add(doctorentity);
//		
//		if(doctor.getPatientlist()!=null)
//		{
//			for(PatientDto p: doctor.getPatientlist())
//			{
//				patiententity.setPbill(p.getPbill());
//				patiententity.setPid(p.getPid());
//				patiententity.setPname(p.getPname());
//				patientlist.add(patiententity);
//				
//			}
//			patiententity.setDoctor(doctorentity);
//			doctorentity.setPatientlist(patientlist);
//			doctorRepositary.save(doctorentity);
//		}
//			return mapper.map(doctorentity,DoctorDto.class);
//			
//		
//	
//	}
//
//
//	@Override
//	public Object getPatientByDocName(String dname) {
//		
//		return doctorRepositary.findByDname(dname);
//		
//	}
//
//
//	@Override
//	public List<DoctorDto> getAllDoctor() {
//		// TODO Auto-generated method stub
//		List<Doctor> doctorentity=doctorRepositary.findAll();
//		List<DoctorDto> doctor=doctorentity.
//		return doctorentity ;
//	}
//
//	private DoctorDto convertEntityToDto(Doctor doctorentity) {
//	
//		return modelMapper.map(doctorentity, DoctorDto.class);
//	}
//	private  Doctor convertDtoToEntity(DoctorDto doctorDto) {
//		return modelMapper.map(doctorDto, Doctor.class);
//	}
//	
//}
	
}