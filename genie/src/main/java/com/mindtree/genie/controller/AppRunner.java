package com.mindtree.genie.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.genie.Dto.CampusDto;
import com.mindtree.genie.entity.Campus;
import com.mindtree.genie.entity.Genie;
import com.mindtree.genie.exception.GenieAppException;
import com.mindtree.genie.exception.ServiceException;
import com.mindtree.genie.services.CampusService;
import com.mindtree.genie.services.GenieService;

@RestController
public class AppRunner {


	@Autowired
	CampusService campusService ;
	
	@Autowired
	GenieService genieService;
	
	@PostMapping( )
	public String insertGenie(Set<Genie>list,int mid) {
		
	return  campusService.insertgenie(list,mid);
	
	
	}
//	@PostMapping("/insertcamp")
//	public String insertCampus(@RequestBody Campus campusmind) {
//	String message = campusService.insertCampusMind(campusmind);
//
//		return message;
	
	@PostMapping("/value")
	public ResponseEntity<CampusDto>insertValues(@RequestBody CampusDto campus)
	{
		CampusDto campus2=campusService.insert(campus);		
		
		return ResponseEntity.status(HttpStatus.OK).body(campus2);


	}
	
	@GetMapping("/getGenie/{mid}")
	
		public Set<Genie> getGenie(@PathVariable int mid) throws GenieAppException
		{
			try {
				return campusService.getGeniee(mid);
			} catch (ServiceException e) {
				throw new GenieAppException(e.getMessage());
			}
		}
	

@PostMapping("/assignGenie/{mid}/{genieId}")
public Genie insert(@PathVariable int mid,@PathVariable int genieId)
{
	return campusService.assign(mid,genieId);
	
}

}