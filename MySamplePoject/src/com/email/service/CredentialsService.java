package com.email.service;
import java.util.Random;
import java.util.Scanner;
import com.email.model.Employee;

public class CredentialsService {
	
	
	String email;
	String password="";
	Scanner sc=new Scanner(System.in);

	Employee emp=new Employee(sc.toString(), sc.toString());
	
	
	public String generateEmail(Employee emp,String dept) {
		
			String fname=emp.getFirstName();
			String lname=emp.getSecondName();
			email=fname+lname+"@"+dept+".abc.com";
			//System.out.println("Email:-"+email);
			return email;
			
	}
	
	public String generatePassword() {
	    
		String upperCase="ABCDEFGHIJKMNOPQRSTUVWXYZ";
		String lowerCase="abcdefghijklmnopqrstuvwxyz";
		String specialCharacters="!@.^*%$";
		String numberCharacters="1234567890";
		String combineCharacters=upperCase+lowerCase+specialCharacters+numberCharacters;
		
		Random random=new Random();
		char[] pwd=new char[11];
		pwd[0]=lowerCase.charAt(random.nextInt(lowerCase.length()));
		pwd[1]=upperCase.charAt(random.nextInt(upperCase.length()));
		pwd[2]=specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		pwd[3]=numberCharacters.charAt(random.nextInt(numberCharacters.length()));
		
		for(int i=1;i<11;i++) {
			pwd[i]=combineCharacters.charAt(random.nextInt(combineCharacters.length()));
			password=password+pwd[i];
		}
		return password;
	}
	public void showCredentials() {
		//System.out.println("Dear "+emp.firstName+" Your generated credentials are as follows");
		System.out.println("Email:-"+email);
		System.out.println("Password:-"+password);
		//System.out.println(password);
	}

}
