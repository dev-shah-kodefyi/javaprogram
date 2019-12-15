package com.mindtree.genie.services.serviceImpl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.genie.entity.Campus;
import com.mindtree.genie.entity.Genie;
import com.mindtree.genie.repositary.CampusRepositary;
import com.mindtree.genie.repositary.GenieRepositary;
import com.mindtree.genie.services.GenieService;

@Service
public class GenieServiceImpl implements GenieService{

	
	
	@Autowired
	CampusRepositary campusRepositary;
	
	@Autowired
	GenieRepositary genieRepositary;
	
	public String insertgenie(Genie genie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Genie assign(int mid) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
	
//	@Autowired
//	GenieRepositary genieRepositary;
//	
//	
//	public String insertgenie(Genie genie) {
//		
//
//			Genie message =genieRepositary.
//
//			return "campus_mind_inserted";
//		
//
//		return null;
//	}

}
