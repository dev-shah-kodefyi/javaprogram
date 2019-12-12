package com.mindtree.hospitalmanagmentsystem.dto;

import com.mindtree.hospitalmanagmentsystem.entity.Doctor;

public class PatientDto {
	
	
	    private String pname;
		private int pid;
		private int pbill;
		private DoctorDto doctor;
		public PatientDto() {
			super();
			// TODO Auto-generated constructor stub
		}
		public PatientDto(String pname, int pid, int pbill, DoctorDto doctor) {
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
		public DoctorDto getDoctor() {
			return doctor;
		}
		public void setDoctor(DoctorDto doctor) {
			this.doctor = doctor;
		}
		
}
