package com.sr.department;

public class SuperDepartment {
	protected String departmentName;
	String todaysWork;
	String workDeadline;
	String todayHoliday;
	String isActivity;
	String doActivity;
	
	public String getDoActiity() {
		return doActivity;
	}
	public void setDoActivity(String doActiity) {
		this.doActivity=doActivity;
	}
	
   public String getIsActivity() {
		return isActivity;
	}


	public void setIsActivity(String isActivity) {
		this.isActivity = isActivity;
	}


public SuperDepartment(String departmentName,String todaysWork,String workDeadline,String todayHoliday) {
		super();
		this.departmentName = departmentName;
		this.todaysWork=todaysWork;
		this.workDeadline=workDeadline;
		this.todayHoliday=todayHoliday;
	}
  

public String getDepartmentName() {
		return departmentName;
	}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}

	public String getTodaysWork() {
	return todaysWork;
}

public void setTodaysWork(String todaysWork) {
	this.todaysWork = todaysWork;
}

public String getWorkDeadline() {
	return workDeadline;
}

public void setWorkDeadline(String workDeadline) {
	this.workDeadline = workDeadline;
}

public String getTodayHoliday() {
	return todayHoliday;
}

public void setTodayHoliday(String todayHoliday) {
	this.todayHoliday = todayHoliday;
}

	
	
	
	


   
   
}
