package com.mindtree.genie.Dto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.genie.entity.Genie;

public class CampusDto {

	
	private int mid;
	private String name;
	private String project;
	
	@JsonIgnoreProperties(value = { "campus" })

	private Set<GenieDto> genielist = new HashSet<>();

	public CampusDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CampusDto(int mid, String name, String project, Set<GenieDto> genielist) {
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

	public Set<GenieDto> getGenielist() {
		return genielist;
	}

	public void setGenielist(Set<GenieDto> genielist) {
		this.genielist = genielist;
	}
	
	

}
