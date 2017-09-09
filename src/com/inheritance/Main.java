package com.inheritance;
/*Class is example of inheritance
 * 
 * IS-A relation
 *
 * Inheritance cane be used only when there IS-A relation is to maintained  throughout the lifetime of the objects involved;
 * however, aggregation is also good choice
 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * HAS-A relation (Aggregation)
 *
 * reusing the code is also greatly achieved by HAS-A relation(aggregation); when there no IS-A relation needed
 */
public class Main { // main class to create objects and it contains main method.
  public static void main(String[] args) {// main method
	  
	  EmployeeAddress employeeAddress=new EmployeeAddress(); // object created of EmployeeAddress class
	  // As it is (IS-A) relation we no need to create EmployeeName object
	  employeeAddress.emplpoyeeName(); // this method (emplpoyeeName();) created in EmployeeName class but we can call it by using the reference variable of EmployeeAddress class as (IS-A relation)
	  employeeAddress.employeAdress();
	  
	  System.out.println("\n");
	  
	  
	  // As it is (HAS-A relation) we need to create both class object and initialise (or userInput) value 
	  AftabAddress aftabaddress= new AftabAddress("Mumbai","Maharashtra", 4000055); // object of Aftabaddress class and given the value for address
	  EmployeeDetails employeeDetails= new EmployeeDetails("Aftabalam Aslam Husen Shaikh", 1000000, 50000, aftabaddress);// object of EmployeeDetails class and given the value for employee details 
	  employeeDetails.printEmployeeDetails();// this method will print the details
}
}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// IS-A Relation (top of the page mentioned which is better to use)

class EmployeeName{ // this class prints the name of employee
	
	void emplpoyeeName() { // method to print the name
		System.out.println("Employee name is : Aftabalam Aslam husen Shaikh");
	}
	
}

class EmployeeAddress extends EmployeeName { // this class extended the parent (EmployeeName) class (IS-A Relation)
	
	void employeAdress() { //method to print the address 
		System.out.println("Employee Address : Mumbai 400 055");
	}
	
}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// HAS-A Relation (Aggregation) (top of the page mentioned which is better to use)

class AftabAddress{ // this class only contain the address of a employee
	
	public String city,state; 
	public long pinCode;
	
	public AftabAddress(String city, String state, long pinCode) { //construct 
		this.city=city;
		this.state=state;
		this.pinCode=pinCode;
	}
	
	
}

class EmployeeDetails{ // this class HAS-A relation with address class because address class contains address
	
	String EmployeeName;
	float EmployeeSalary;
	float EmployeeBonus;
	AftabAddress aftabaddress; //  Example of aggregation (reference variable of AftabAddress class )
	
	public EmployeeDetails(String name, float salary, float bonus, AftabAddress aftabaddress) { // constructor
		this.EmployeeName=name;
		this.EmployeeSalary=salary;
		this.EmployeeBonus=bonus;
		this.aftabaddress=aftabaddress; // Aggregation
	}
	
	void printEmployeeDetails() { // this method will print the details of Employee
		System.out.println("EMPLOYEE DETAILS:");
		System.out.println("\n");
		System.out.println("Name is :- " + " " + EmployeeName);
		System.out.println("Salary is :- " + " " + EmployeeSalary);
		System.out.println("Bonus is :- " + " " + EmployeeBonus);
		System.out.println("\n");
		System.out.println(" City is :-" + " " + aftabaddress.city);
		System.out.println(" State is :-" + " " + aftabaddress.state);
		System.out.println(" Pincode is :-" + " " + aftabaddress.pinCode);
	}
	
}








