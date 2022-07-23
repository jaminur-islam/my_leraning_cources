package com.pkg8;

import java.io.FileWriter;
import java.util.Formatter;
import java.io.IOException;
import java.util.Scanner;
public class Signup{

	public Signup() {
		// TODO Auto-generated constructor stub
	}

	public void signup(){
	try{

	Scanner input = new Scanner(System.in);
	
	System.out.println("\n");
	System.out.println("\t\t\t\t__________________________________");
    System.out.println("\t\t\t\t__________________________________\n");
	
	System.out.print("\t\t\t\tEnter Your ID: ");
	String ID=input.nextLine();
	
	System.out.println("\t\t\t\t__________________________________");
    System.out.println("\t\t\t\t__________________________________");
	
	System.out.print("\t\t\t\tEnter Your Password: ");
	String pass=input.nextLine();
	System.out.println("\t\t\t\t__________________________________");
    System.out.println("\t\t\t\t__________________________________");
	System.out.println("\n");
	
	FileWriter obj1 = new FileWriter("C:/Users/ASUS/OneDrive/Desktop/Project/ID-password-directory/Pass-Doc.txt",true);
	Formatter formatter = new Formatter(obj1);
	formatter.format("%s %s \r\n\n",ID,pass);
	
	System.out.println("\t\t\t\t*******||  CONGRATULATIONS  ||*********");
	System.out.println("\t\t\t\t    Your Registration is completed!!   ");
	
	formatter.close();
	}
	catch(IOException e){
	
		System.out.println("An error occured");
		e.printStackTrace();
		}
	}
}