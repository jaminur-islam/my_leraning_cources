package com.pkg7;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.Formatter;
import java.io.IOException;

public class Login{

	boolean log;
	public Login(){}
	
	public void login(){
	
	do{
	
		Scanner input=new Scanner(System.in);
		

		System.out.println("\n");
		System.out.println("\t\t\t\t__________________________________");
		System.out.println("\t\t\t\t__________________________________");
		System.out.print("\t\t\t\tEnter Your ID : ");
		String loginID=input.nextLine();
		System.out.println("\t\t\t\t__________________________________");
		System.out.println("\t\t\t\t__________________________________");
		System.out.print("\t\t\t\tEnter Your Password : ");
		String loginPass=input.nextLine();
		System.out.println("\t\t\t\t__________________________________");
		System.out.println("\t\t\t\t__________________________________");
		System.out.println("\n");
		
		log=false;
		try{
			
			File obj1=new File("C:/Users/ASUS/OneDrive/Desktop/Project/ID-password-directory/Pass-Doc.txt");
			Scanner scanner =new Scanner(obj1);
			while(scanner.hasNext()){
			
				String ID=scanner.next();
				String pass=scanner.next();

			while(loginID.equals(ID) && loginPass.equals(pass)){
	
			log=true;
			break;

		}
	}
}
		catch(IOException e){
	
			System.out.println(e);
		}
		
		if(log==true){

			System.out.println("\t\t\t\t**********************************");
			System.out.println("\t\t\t\t!!!!!!!  LOGIN SUCCESSFUL  !!!!!!!");
			System.out.println("\t\t\t\t**********************************");
			System.out.println(" \n ");
		}
		else{
			
			 
			  System.out.println("\t\t\t	EEEEEEE   RRRRRRR    0000000  0000000  RRRRRR		");
			  System.out.println("\t\t\t	EE        RR    RRR  00   00  00   00  RR   RRR		");
              System.out.println("\t\t\t	EEEEEEE   RRRRRR     00   00  00   00  RRRRRR		");
              System.out.println("\t\t\t	EE        RR   RRR   00   00  00   00  RR    RRR    ");
              System.out.println("\t\t\t	EEEEEEE   RR    RRRR 0000000  0000000  RR     RRRR	");
			  System.out.println("\n");
			  System.out.println("\t\t\t        !!!!!!!!!!!!!   PLEASE TRY AGAIN   !!!!!!!!!!!!!!   ");
			 
					 
		}
	}while(log!=true);
				//return false;
	}
}
