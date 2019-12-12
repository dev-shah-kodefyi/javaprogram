package com.mindtree.hospitalmanagmentsystem.service.serviceimpl;

import java.util.Comparator;

import com.mindtree.hospitalmanagmentsystem.entity.Doctor;

public class SalaryCompare implements Comparator<Doctor> {

	@Override
	public int compare(Doctor o1, Doctor o2) {
		
		if(o1.getDsalary() > o2.getDsalary())
			return 1;
		if(o1.getDsalary() < o2.getDsalary())
			return -1;
		else
			return 0;
		
	}

}
