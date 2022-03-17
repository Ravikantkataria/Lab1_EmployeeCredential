package com.glearning.pg.client;

import java.util.Scanner;

import com.glearning.pg.model.Employee;
import com.glearning.pg.service.CredentialService;

public class ProfileGeneratorClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Firstname");
		String firstName = scanner.next();
		System.out.println("Enter the LastName");
		String lastName = scanner.next();
		
		
		System.out.println("Please enter your option");
		int option = scanner.nextInt();
		System.out.println("0 : Admin");
		System.out.println("1 : HR");
		System.out.println("2 : Technical");
		System.out.println("4 : Legal");
		
		Employee employee = new Employee(firstName,lastName);
		switch(option) {
		case 0 : 
			employee.setDept("Admin");
		    break;
		    
		case 1 : 
			employee.setDept("HR");
		    break;
		    
		case 2 : 
			employee.setDept("Technical");
		    break;
		    
		case 3 : 
			employee.setDept("Legal");
		    break;
		    
		default :
			System.out.println("Enter correct value");
		
		}
		
		// Call the credential services
		
		String emailAddress = CredentialService.generateEmailAddress(firstName, lastName, employee.getDept());
		// System.out.println(emailAddress);
		employee.setEmailAddress(emailAddress);
		System.out.println("Please enter the password length");
		int length = scanner.nextInt(10);
		String password = CredentialService.generatePassword(length);
		employee.SetPassword(password);
		
		CredentialService.showCredentials(employee);
		//finally close
		scanner.close();
}
}

