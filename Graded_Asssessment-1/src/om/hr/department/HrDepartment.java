package om.hr.department;

import com.sr.department.SuperDepartment;

public class HrDepartment extends SuperDepartment {

	public HrDepartment(String departmentName,String todaysWork,String workDeadline,String todayHoliday) {
		super(departmentName,todaysWork,workDeadline,todayHoliday);
		// TODO Auto-generated constructor stub
	}

	public String departmentName() {
		 
		 SuperDepartment sd=new SuperDepartment(this.getDepartmentName(),this.getTodaysWork(),super.getWorkDeadline(),super.getIsActivity());	 
		 
		 return sd.toString();
		    
	   }
	
	
	
	public String getDoActiity() {
		 String tActivity="Team Lunch";
		 return tActivity;
		   
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
