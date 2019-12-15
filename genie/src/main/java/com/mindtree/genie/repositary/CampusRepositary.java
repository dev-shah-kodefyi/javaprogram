package com.mindtree.genie.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.genie.entity.Campus;


@Repository
public interface CampusRepositary extends JpaRepository<Campus,Integer>{

	

	Campus findByMid(int mid);

}