package com.greatlearning.department.main;

import com.greatlearning.department.service.AdminDepartment;
import com.greatlearning.department.service.HrDepartment;
import com.greatlearning.department.service.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		
		
		AdminDepartment adDept=new AdminDepartment();
		
		HrDepartment hrDept=new HrDepartment();
		
		TechDepartment techDept=new TechDepartment();
		
		System.out.println("Welcome to "+adDept.departmentName());
		System.out.println(adDept.getTodaysWork());
		System.out.println(adDept.getWorkDeadline());
		System.out.println(adDept.isTodayAHoliday());
		
		System.out.println("Welcome to "+hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayAHoliday());
		
		System.out.println("Welcome to "+techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());
		// TODO Auto-generated method stub

	}

}
