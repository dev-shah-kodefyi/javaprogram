package com.mindtree.hospitalmanagmentsystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Patient {
	@Id
    private String pname;
	private int pid;
	private int pbill;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="doctorname")
	private Doctor doctor= new Doctor();

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String pname, int pid, int pbill, Doctor doctor) {
		super();
		this.pname = pname;
		this.pid = pid;
		this.pbill = pbill;
		this.doctor = doctor;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPbill() {
		return pbill;
	}

	public void setPbill(int pbill) {
		this.pbill = pbill;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
}
