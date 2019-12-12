package com.mindtree.hospitalmanagmentsystem.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Doctor {
	@Id
	private String dname;
	private int did;
	private String dexperience;
	private int dsalary;

	@JsonIgnoreProperties(value= {"doctor"})
	@OneToMany(cascade=CascadeType.ALL,mappedBy="doctor")
	
	private List<Patient> patientlist=new ArrayList<>();

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(String dname, int did, String dexperience, int dsalary, List<Patient> patientlist) {
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

	public List<Patient> getPatientlist() {
		return patientlist;
	}

	public void setPatientlist(List<Patient> patientlist) {
		this.patientlist = patientlist;
	}

	
	
	
}