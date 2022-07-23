package com;
import com.pkg1.* ;
import com.pkg2.* ;
import com.pkg3.* ;
import com.pkg4.* ;
import com.pkg5.* ;
import com.pkg6.* ;
import com.pkg7.* ;
import com.pkg8.* ;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;


public class Start{
	public static void main(String[] args){
		
		File f1= new File("Data-directory");
		f1.mkdir();
		
		File f2= new File("ID-password-directory");
		f2.mkdir();
		
		while(true){
		int choice;
		
		System.out.print(" \n");
		System.out.print(" \n");
		
		System.out.println("\t\t\t\t||===============>>>> Please enter your user status ---]]  ");
		System.out.print(" \n");
		System.out.println("\t\t\t\t1) Applicant. \n\t\t\t\t2) Company. \n\t\t\t\t3) Exit.");
		
		Scanner in=new Scanner(System.in);
		
		System.out.print(" \n");
		System.out.print(" \n");
		System.out.print("\t\t\t\t||===============>>>> Please chose one option  --->>>  ");
		choice=in.nextInt();
		
		if(choice==1){
				
				System.out.print(" \n");
				System.out.print(" \n");
				System.out.println("\t\t\t\t\t==================================");
				System.out.println("\t\t\t\t\t||  Welcome to Applicant status  ||");
				System.out.println("\t\t\t\t\t==================================");
				System.out.print(" \n");
				System.out.print(" \n");
				
				int inch;
				System.out.println("\t\t\t\t||===============>>>> Please select one option and proceed ---]] ");
				
				System.out.print(" \n");
		
				System.out.println("\t\t\t\t1) Login. \n\t\t\t\t2) Create a profile. \n");
				Scanner ch=new Scanner(System.in);
	
				System.out.print(" \n");
				System.out.print("\t\t\t\t||===============>>>> Chose one option  --->>> ");
				
				inch=ch.nextInt();
					Login log1 = new Login();
					if(inch==1){	
						log1.login();		
					}
					else if(inch==2){
						Signup sig1 = new Signup();
						sig1.signup();
						System.out.print(" \n");
						System.out.print("\t\t\t\t||===============>>>> Please Login ---|| \n");
						log1.login();
						
					}
					else{
						System.out.print(" \n");
						System.out.println("\t\t\t\t\t[=][=][=][=] Invalid Option Chosen [=][=][=][=]");
						System.out.print(" \n");
					}
					
				while(true){
					
					int Achoice;
					System.out.println("\t\t\t\t||===============>>>> Please chose one option ---]] ");
				
					System.out.println("\n");
					
					System.out.println("\t\t\t\t1) Applicant profile create. \n\t\t\t\t2) Show Company Advertisement. \n\t\t\t\t3) Return.");
					Scanner inn=new Scanner(System.in);
				
					System.out.println("\n");
					System.out.print("\t\t\t\t||===============>>>> Enter that option  --->>>  ");
					Achoice=inn.nextInt();
					System.out.print(" \n");
				
						if(Achoice==1)
						{	
							DemoApplicant obj1= new DemoApplicant();
							obj1.takeallinputs();
						}
						else if(Achoice==2){
							
							CompanyDataReading obj11= new CompanyDataReading();
							obj11.openFileCom();
							obj11.readFileCom();
							obj11.closeFileCom();
							
						}
						else if(Achoice==3){
							
							break;
						}
						else{
						
							System.out.print(" \n");
							System.out.println("\t\t\t\t\t[=][=][=][=] Invalid Option Chosen [=][=][=][=]");
							System.out.print(" \n");
						}
				}
		}
				
		else if(choice==2){
				
				System.out.print(" \n");
				System.out.print(" \n");
				System.out.println("\t\t\t\t\t==================================");
				System.out.println("\t\t\t\t\t||  Welcome to Company status  ||");
				System.out.println("\t\t\t\t\t==================================");
				System.out.print(" \n");
				System.out.print(" \n");
				
				int inch;
				System.out.println("\t\t\t\t||===============>>>> Please select one option and proceed ---]] ");
			
				System.out.print(" \n");
		
				System.out.println("\t\t\t\t1) Login. \n\t\t\t\t2) Create a profile. \n");
				
				Scanner ch=new Scanner(System.in);
			
				System.out.print(" \n");
				System.out.print("\t\t\t\t||===============>>>> Chose one option  --->>> ");
				inch=ch.nextInt();
				Clogin clog1 = new Clogin();
				
					if(inch==1){	
						clog1.clogin();		
					}
					else if(inch==2){
						Csignup csig1 = new Csignup();
						csig1.csignup();
						System.out.print(" \n");
						System.out.print("\t\t\t\t||===============>>>> Please Login ---]] \n");
						clog1.clogin();
						
					}
					else{
						
						System.out.print(" \n");
						System.out.println("\t\t\t\t\t[=][=][=][=] Invalid Option Chosen [=][=][=][=]");
						System.out.print(" \n");
					}
				
				while(true){
				
					int Cchoice;
					System.out.println("\t\t\t\t||===============>>>> Please chose one option ---]] ");
					
					System.out.println("\n");
				
					System.out.println("\t\t\t\t1) Create company's profile. \n\t\t\t\t2) Show Applicant profiles. \n\t\t\t\t3)Return. ");
					Scanner innn=new Scanner(System.in);
					
					System.out.println("\n");
					System.out.print("\t\t\t\t||===============>>>> Enter that option  --->>>  ");
					
					Cchoice=innn.nextInt();
					System.out.print(" \n");
				
					if(Cchoice==1)
					{	
						DemoCompany obj2= new DemoCompany();
						obj2.takeallinputs();
					}
					else if(Cchoice==2){
						
						ApplicantDataReading obj22= new ApplicantDataReading();
						obj22.openFile();
						obj22.readFile();
						obj22.closeFile();
					}
					else if(Cchoice==3){
						
							break;
						}
						
					else{
							System.out.print(" \n");
							System.out.println("\t\t\t\t\t[=][=][=][=] Invalid Option Chosen [=][=][=][=]");
							System.out.print(" \n");
						}
					}
				}
				
			else if(choice==3){
			
						break;
					}
			else{
					System.out.print(" \n");
					System.out.println("\t\t\t\t\t[=][=][=][=] Invalid Option Chosen [=][=][=][=]");
					System.out.print(" \n");
					}
				
		}
	}
}