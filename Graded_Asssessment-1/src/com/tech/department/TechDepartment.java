package com.tech.department;

import com.sr.department.SuperDepartment;

public class TechDepartment extends SuperDepartment {

	public TechDepartment(String departmentName,String todaysWork,String workDeadline,String todayHoliday) {
		super(departmentName,todaysWork,workDeadline,todayHoliday);
		// TODO Auto-generated constructor stub
	}
	
	public String departmentName() {
		 
		 SuperDepartment sd=new SuperDepartment(this.getDepartmentName(),this.getTodayHoliday(),super.getWorkDeadline(),super.getIsActivity());	 
		 
		 return sd.toString();
		    
	   }
	 
	   public String getWorkDeadline() {
		   
		   return super.getWorkDeadline().toString();
	   }
	public String getIsActivity() {
		String s="Core Java";
		return s;
	}
	public String getTodayHoliday() {
		   
		   return super.getTodayHoliday().toString();
	   }
}
