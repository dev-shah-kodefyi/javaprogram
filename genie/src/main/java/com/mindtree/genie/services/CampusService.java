package com.mindtree.genie.services;

import java.util.List;
import java.util.Set;

import javax.sql.rowset.serial.SerialException;

import com.mindtree.genie.Dto.CampusDto;
import com.mindtree.genie.entity.Campus;
import com.mindtree.genie.entity.Genie;
import com.mindtree.genie.exception.ServiceException;



public interface CampusService {

	

	String insertCampusMind(Campus campusmind);

	String insertgenie(Set<Genie> list, int mid);

	//CampusDto insert(CampusDto campus);

	CampusDto insert(CampusDto campus);

	Set<Genie> getGeniee(int mid) throws ServiceException;

	Genie assign(int mid, int genieId);



}
