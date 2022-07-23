package com.pkg6;
import com.pkg1.*;
import com.pkg2.*;
import java.io.*;
import java.util.*;
import java.io.IOException;

public class CompanyDataReading extends DemoCompany{
	

		
		private Scanner scp;
		public void openFileCom(){
			try {		
				scp = new Scanner(new File("C:/Users/ASUS/OneDrive/Desktop/Project/Data-directory/Company-data.txt"));	
			}
			catch(IOException ie) {
				System.out.println("Could not find the file");
			}
		}
			public void readFileCom(){
				while(scp.hasNextLine()) {       				
					String a = scp.nextLine();
					String b = scp.nextLine();
					String c = scp.nextLine();
					String d = scp.nextLine();
					String e = scp.nextLine();
					String f = scp.nextLine();
					String g = scp.nextLine();
					System.out.println("\t\t\t\t======================================================================");
					System.out.printf("\t\t\t\t|	Company Name            - %s\n", a);
					System.out.printf("\t\t\t\t|	Address                 - %s\n", b);
					System.out.printf("\t\t\t\t|	Contact Number          - %s\n", c);
					System.out.printf("\t\t\t\t|	Job Category            - %s\n", d);
					System.out.printf("\t\t\t\t|	Required Skills         - %s\n", e);
					System.out.printf("\t\t\t\t|	Required Experience     - %s\n", f);
					System.out.printf("\t\t\t\t|	Required Qualification  - %s\n", g);
					System.out.println("\t\t\t\t======================================================================\n\n");
				}
			}
			public void closeFileCom() {
				scp.close();
			}
  }
