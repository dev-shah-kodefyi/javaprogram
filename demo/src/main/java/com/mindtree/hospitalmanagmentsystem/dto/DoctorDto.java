package com.mindtree.hospitalmanagmentsystem.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class DoctorDto {

	private String dname;
	private int did;
	private String dexperience;
	private int dsalary;
	
	@JsonIgnoreProperties(value= {"doctor"})
	private List<PatientDto> patientlist=new ArrayList<>();

	public DoctorDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DoctorDto(String dname, int did, String dexperience, int dsalary, List<PatientDto> patientlist) {
		super();
		this.dname = dname;
		this.did = did;
		this.dexperience = dexperience;
		this.dsalary = dsalary;
		this.patientlist = patientlist;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDexperience() {
		return dexperience;
	}

	public void setDexperience(String dexperience) {
		this.dexperience = dexperience;
	}

	public int getDsalary() {
		return dsalary;
	}

	public void setDsalary(int dsalary) {
		this.dsalary = dsalary;
	}

	public List<PatientDto> getPatientlist() {
		return patientlist;
	}

	public void setPatientlist(List<PatientDto> patientlist) {
		this.patientlist = patientlist;
	}
		
}
