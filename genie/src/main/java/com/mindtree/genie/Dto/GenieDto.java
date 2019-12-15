package com.mindtree.genie.Dto;

public class GenieDto {

	
	private int genieId;
	private String genieDescription;
	private boolean genieStatus;
	private CampusDto campus;
	public GenieDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GenieDto(int genieId, String genieDescription, boolean genieStatus, CampusDto campus) {
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
	public CampusDto getCampus() {
		return campus;
	}
	public void setCampus(CampusDto campus) {
		this.campus = campus;
	}
	
	
}
