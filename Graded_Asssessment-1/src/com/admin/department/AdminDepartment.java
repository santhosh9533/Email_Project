package com.admin.department;

import com.sr.department.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	
	 public AdminDepartment(String departmentName,String todaysWork,String workDeadline,String todayHoliday) {
		super(departmentName,todaysWork,workDeadline,todayHoliday);
		// TODO Auto-generated constructor stub
	}

	public String departmentName() {
		 
		 SuperDepartment sd=new SuperDepartment(super.getDepartmentName(),super.getTodaysWork(),super.getWorkDeadline(),super.getTodayHoliday());	 
	
		 //System.out.println("Welcome to "+sd.getDepartmentName().toString());
		 return sd.toString();
		    
	   }
	   
	   public String getTodaysWork() {
		   return super.getTodaysWork().toString();
		   
	   }
	   
	   public String getWorkDeadline() {
		   
		   return super.getWorkDeadline().toString();
	   }
	   public String getTodayHoliday() {
		   
		   return super.getTodayHoliday().toString();
	   }
	   
	}
	

