package com.greatlearning.department.service;

import com.greatlearning.department.model.SuperDepartment;

public class TechDepartment extends SuperDepartment {

	public String departmentName(){
		return "Tech Department";
		
	}
	
	public String getTodaysWork(){
		return "Complete coding of module 1";
		
	}
	
	public String getWorkDeadline(){
		return  "Complete by EOD" ;
		
	}
	
	 public String getTechStackInformation(){
		return  "Core Java" ;
		
	}


}
