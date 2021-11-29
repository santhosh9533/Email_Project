package com.email.model;

public class Employee {
  public String firstName;
  public String secondName;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
  
  public String getSecondName() {
	  return secondName;
  }
  public void serSecondName(String secondName) {
	  this.secondName=secondName;
  }
  
  public Employee(String firstName,String secondName ) {
	  //super();
	  this.firstName=firstName;
	  this.secondName=secondName;
  }

}
