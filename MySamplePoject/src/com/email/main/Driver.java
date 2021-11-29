package com.email.main;

import java.util.Scanner;

import com.email.model.Employee;
import com.email.service.CredentialsService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
			System.out.println("Please enter the Department");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resources");
			System.out.println("4. Legal");
			
			Employee emp = new Employee("santhosh" , "reddy");
			CredentialsService cservice=new CredentialsService();
			int option;
			
             Scanner sc=new Scanner(System.in);
			
			option=sc.nextInt();
			sc.close();
			
			
			
			switch(option) {
			case 1:
				System.out.println("Dear "+emp.firstName+" Your generated credentials are as follows");
				cservice.generateEmail(emp, "tech");
				cservice.generatePassword();
				cservice.showCredentials();
				break;
				
			case 2:
				System.out.println("Dear "+emp.firstName+" Your generated credentials are as follows");
				cservice.generateEmail(emp, "Adm");
				cservice.generatePassword();
				cservice.showCredentials();
				break;
				
			case 3:
				System.out.println("Dear "+emp.firstName+" Your generated credentials are as follows");
				cservice.generateEmail(emp, "HR");
				cservice.generatePassword();
				cservice.showCredentials();
				break;
				
			case 4:
				System.out.println("Dear "+emp.firstName+" Your generated credentials are as follows");
				cservice.generateEmail(emp, "LG");
				cservice.generatePassword();
				cservice.showCredentials();
				break;
				
			default:
				System.out.println("Invalid input");
			
		
		}
		
			
			
	}
}


