package com.mindtree.genie.repositary;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.genie.entity.Campus;
import com.mindtree.genie.entity.Genie;

@Repository
public interface GenieRepositary extends JpaRepository<Genie,Integer> {

	

	
	

}