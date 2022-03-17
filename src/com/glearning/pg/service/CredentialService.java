package com.glearning.pg.service;
import java.util.*;

import com.glearning.pg.model.Employee;

public class CredentialService {
 
	//generate username and email address
	//generate password
	//display password
	public static String generateEmailAddress(String firstName,String lastName,String dept) {
		return firstName+"_"+lastName+"@"+dept+"abc.com";
	} 
	
	public final static String generatePassword(int length){
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqurstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		
		String seed = capitalLetters + smallLetters + numbers + specialCharacters;
		
		Random random = new Random();
		
		if(length<8) {
		throw new IllegalArgumentException("Password length should be more than 8 character");
	    }
	    char[] password = new char[length];
	    
	    for(int i=0;i<length;i++) {
	    	int randomNumber = random.nextInt(seed.length());
	    	char c = seed.charAt(randomNumber);
	    	password[i] = c;
	    }
	return String.copyValueOf(password);
	}
	
	public static void showCredentials(Employee employee) {
		System.out.println("====="+employee.getFirstName()+" "+employee.getLastName()+" Details ====");
		System.out.println("FirstName --> "+employee.getFirstName());
		System.out.println("LastName -->"+employee.getLastName());
		
		System.out.println("EmailAddress-->"+employee.getEmailAddress());
		System.out.println("Password-->"+employee.getPassword());
		
		System.out.println("========"+employee.getFirstName()+" "+employee.getLastName()+"=====");
		
		
		
	}
}
