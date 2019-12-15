package com.mindtree.genie.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "campus_mind")
public class Campus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mid;
	private String name;
	private String project;
	@OneToMany(cascade = CascadeType.ALL)
	@JsonIgnoreProperties(value = { "campus" })

	private Set<Genie> genielist = new HashSet<>();

	public Campus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Campus(int mid, String name, String project, Set<Genie> genielist) {
		super();
		this.mid = mid;
		this.name = name;
		this.project = project;
		this.genielist = genielist;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Set<Genie> getGenielist() {
		return genielist;
	}

	public void setGenielist(Set<Genie> genielist) {
		this.genielist = genielist;
	}

}
