package com.mindtree.genie.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Genie")
public class Genie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int genieId;
	private String genieDescription;
	private boolean genieStatus;
	
	@ManyToOne(cascade = CascadeType.ALL)
	//@JsonIgnoreProperties
	 private Campus campus;
	 
	
	public Genie() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Genie(int genieId, String genieDescription, boolean genieStatus, Campus campus) {
		super();
		this.genieId = genieId;
		this.genieDescription = genieDescription;
		this.genieStatus = genieStatus;
		this.campus = campus;
	}


	public int getGenieId() {
		return genieId;
	}


	public void setGenieId(int genieId) {
		this.genieId = genieId;
	}


	public String getGenieDescription() {
		return genieDescription;
	}


	public void setGenieDescription(String genieDescription) {
		this.genieDescription = genieDescription;
	}


	public boolean isGenieStatus() {
		return genieStatus;
	}


	public void setGenieStatus(boolean genieStatus) {
		this.genieStatus = genieStatus;
	}


	public Campus getCampus() {
		return campus;
	}


	public void setCampus(Campus campus) {
		this.campus = campus;
	}


}