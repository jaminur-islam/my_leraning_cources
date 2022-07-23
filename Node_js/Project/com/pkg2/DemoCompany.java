package com.pkg2;
import com.pkg1.* ;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class DemoCompany extends Company{
	
	public void takeallinputs(){
		
		File f2 = new File("C:/Users/ASUS/OneDrive/Desktop/Project/Data-directory/Company-data.txt");
		
		try{
			
		f2.createNewFile();
		
		
		}
		
		catch(Exception e){
			System.out.println(e);
		}
		
		FileWriter fw= null;
		
		try {
			fw = new FileWriter(f2, true);
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("\n");	
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.print("\t\t\t\t[] Enter Company Name -- ");
		String n= sc.nextLine();
		super.setname(n);
		
        System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.println("\t\t\t\t==>> Company name  ==>> " + super.getname());
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.print("\t\t\t\t[] Enter Company Current Address -- ");
		String add= sc.nextLine();  
		super.setaddress(add);
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.println("\t\t\t\t==>> Address ==>> " + super.getaddress());
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.print("\t\t\t\t[] Enter Company's Contact Number -- ");
	
		String num= sc.nextLine();
		super.setcontactnumber(num);
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.println("\t\t\t\t==>> Contact Number ==>> " + super.getcontactnumber());
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.print("\t\t\t\t[] Enter Job Category -- ");
		String jc= sc.nextLine();   
		super.setjobcategory(jc);
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.println("\t\t\t\t==>> Job Category ==>> " + super.getjobcategory());
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.print("\t\t\t\t[] Enter Required Skill -- ");
		String rs= sc.nextLine();  
		super.setrequiredskill(rs);
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.println("\t\t\t\t==>> Required Skill ==>> " + super.getrequiredskill());
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.print("\t\t\t\t[] Enter Required Experience -- ");
		String re= sc.nextLine();
		super.setrequiredexperience(re);
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.println("\t\t\t\t==>> Required Experience ==>> " + super.getrequiredexperience());
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.print("\t\t\t\t[] Enter Required Qualification -- ");
		String rq= sc.nextLine();   
		super.setrequiredqualification(rq);
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		
		System.out.println("\t\t\t\t==>> Required Qualification ==>> " + super.getrequiredqualification());
		
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\n");
		
		fw.write(super.getname()+ "\n");
		fw.write(super.getaddress()+ "\n");
		fw.write(super.getcontactnumber()+ "\n");
		fw.write(super.getjobcategory()+ "\n");
		fw.write(super.getrequiredskill()+ "\n");
		fw.write(super.getrequiredexperience()+ "\n");
		fw.write(super.getrequiredqualification()+ "\n");
		
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