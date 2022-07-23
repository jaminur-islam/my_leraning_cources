package com.pkg4;
import com.pkg3.* ;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class DemoApplicant extends Applicant{
	
	
	
	public void takeallinputs(){
		
		
		File f1 = new File("C:/Users/ASUS/OneDrive/Desktop/Project/Data-directory/Applicant-data.txt");
		
		try{
			
		f1.createNewFile();
		
		
		}
		
		catch(Exception e){
			System.out.println(e);
		}
		
		
		FileWriter fw= null;
		
		try {
			fw = new FileWriter(f1, true);
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("\n");
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.print("\t\t\t\t[] Enter Applicant Name -- ");
		String n= sc.nextLine();
		super.setname(n);
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.println("\t\t\t\t==>> Name ==>> " + super.getname());
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.print("\t\t\t\t[] Enter Applicant Age -- ");
		int a= sc.nextInt();
		super.setage(a);
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.println("\t\t\t\t==>> Age ==>>  " + super.getage());
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.print("\t\t\t\t[] Enter Applicant Current Address -- ");
		String add= sc.next();  
		super.setcurrentaddress(add);
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.println("\t\t\t\t==>> Address ==>> " + super.getcurrentaddress());
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.print("\t\t\t\t[] Enter Applicant Phone Number -- ");
		String no= sc.next();
		super.setphoneno(no);
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.println("\t\t\t\t==>> Phone Number ==>> " + super.getphoneno());
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.print("\t\t\t\t[] Enter Applicant Bachelor Degree on -- ");
		String bscon= sc.next();
		super.setbscdegreeon(bscon);
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.println("\t\t\t\t==>> Degree on ==>> " + super.getbscdegreeon());
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.print("\t\t\t\t[] Enter Applicant Qualification -- ");
		String qual= sc.next();
		super.setqualification(qual);
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.println("\t\t\t\t==>> Qualification ==>> " + super.getqualification());
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.print("\t\t\t\t[] Enter Applicant result -- ");
		double r= sc.nextDouble();
		super.setresult(r);
	
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.println("\t\t\t\t==>> Result ==>> " + super.getresult());
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.print("\t\t\t\t[] Enter Applicant Job Experience -- ");
		String exp= sc.next();   
		super.setexperience(exp);
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.println("\t\t\t\t==>> Experience ==>> " + super.getexperience());
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\n");
		
		
		fw.write(super.getname()+ "\n");
		fw.write(super.getage()+ "\n");
		fw.write(super.getcurrentaddress()+ "\n");
		fw.write(super.getphoneno()+ "\n");
		fw.write(super.getbscdegreeon()+ "\n");
		fw.write(super.getqualification()+ "\n");
		fw.write(super.getresult()+ "\n");
		fw.write(super.getexperience()+ "\n");
		
		}
		catch(IOException io) {
			System.out.println("Exception while writing in a file.");
		}
		
		finally {
			
			try {
				fw.close();
			}
			
			catch(IOException io) {
				System.out.println("Exception while close a file writer after writing in a file.");
				}
			}
		}
		
		
	
	}
	
