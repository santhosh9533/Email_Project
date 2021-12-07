package Department;

import com.admin.department.AdminDepartment;
import com.sr.department.SuperDepartment;
import com.tech.department.TechDepartment;

import om.hr.department.HrDepartment;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AdminDepartment ad=new AdminDepartment("Admin Department","Complete your document submission","Complete by EOD","Today is not a Holiday");
		System.out.println("Welcome to "+ad.getDepartmentName().toString());
		System.out.println(ad.getTodaysWork().toString());
		System.out.println(ad.getWorkDeadline().toString());
		System.out.println(ad.getTodayHoliday().toString()+"\n\n");
		
		HrDepartment hd=new HrDepartment("HR Department","Fill todays timesheet and mark your attendence ","Complete by EOD","Today is not a Holiday");
		System.out.println("Welcome to "+hd.getDepartmentName().toString());
		System.out.println(hd.getDoActiity().toString());
		System.out.println(hd.getTodaysWork().toString());
		System.out.println(hd.getWorkDeadline().toString());
		System.out.println(hd.getTodayHoliday().toString()+"\n\n");

		TechDepartment td=new TechDepartment("Tech Department","Complete coding module 1","Complete by EOD","Today is not a Holiday");
		System.out.println("Welcome to "+td.getDepartmentName().toString());
		System.out.println(td.getTodaysWork().toString());
		System.out.println(td.getWorkDeadline().toString());
		System.out.println(td.getIsActivity().toString());
		System.out.println(td.getTodayHoliday().toString());
		
		
		


	}

}
