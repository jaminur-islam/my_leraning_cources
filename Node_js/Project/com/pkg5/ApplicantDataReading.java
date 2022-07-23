package com.pkg5;
import com.pkg4.* ;
import com.pkg3.* ;
import java.io.*;
import java.util.*;
import java.io.IOException;

public class ApplicantDataReading extends DemoApplicant{
	
	private Scanner x;
	
	public void openFile(){
		try {		
			x = new Scanner(new File("C:/Users/ASUS/OneDrive/Desktop/Project/Data-directory/Applicant-data.txt"));	
		}
		catch(IOException ie) {
			System.out.println("Could not find the file");
		}
	}
		public void readFile(){
			while(x.hasNextLine()) {       				
				String a = x.nextLine();
				String b = x.nextLine();
				String c = x.nextLine();
				String d = x.nextLine();
				String e = x.nextLine();
				String f = x.nextLine();
				String g = x.nextLine();
				String i = x.nextLine();
				System.out.println("\t\t\t\t======================================================================");
				System.out.printf("\t\t\t\t|	Applicant Name   	 - %s\n", a);
				System.out.printf("\t\t\t\t|	Applicant Age    	 - %s\n", b);
				System.out.printf("\t\t\t\t|	Applicant Address 	 - %s\n", c);
				System.out.printf("\t\t\t\t|	Applicant ID 		 - %s\n", d);
				System.out.printf("\t\t\t\t|	Applicant Dept   	 - %s\n", e);
				System.out.printf("\t\t\t\t|	Applicant Degree 	 - %s\n", f);
				System.out.printf("\t\t\t\t|	Applicant CGPA   	 - %s\n", g);
				System.out.printf("\t\t\t\t|     	Applicant Experience	 - %s\n", i);
				System.out.println("\t\t\t\t======================================================================\n\n");
			}
		}
		public void closeFile() {
			x.close();
		}
}
