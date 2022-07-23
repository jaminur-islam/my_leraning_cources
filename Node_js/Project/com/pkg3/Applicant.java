package com.pkg3;


public abstract class Applicant{
	private String name;
	private int age;
	private	String currentaddress;  
	private	String phoneno;
	private	String bscdegreeon;
	private String qualification;
	private	double result;
	private	String experience; 
	
	
	public void setname(String n){
		name= n;
	}
	public String getname(){
		return name;
	}
	
	
	
	public void setage(int a){
		age = a;
	}
	public int getage(){
		return age;
	}
	
	
	
	public void setcurrentaddress(String add){
		currentaddress = add;
	}
	public String getcurrentaddress(){
		return currentaddress;
	}
	
	
	
	public void setphoneno(String no){
		phoneno = no;
	}
	public String getphoneno(){
		return phoneno;
	}
	
	
	
	public void setbscdegreeon(String bscon){
		bscdegreeon = bscon;
	}
	public String getbscdegreeon(){
		return bscdegreeon;
	}
	
	
	
	public void setqualification(String qual){
		qualification = qual;
	}
	public String getqualification(){
		return qualification;
	}
	
	
	
	public void setresult(double r){
		result = r;
	}
	public double getresult(){
		return result;
	}
	
	
	
	public void setexperience(String exp){
		experience = exp;
	}
	public String getexperience(){
		return experience;
	}
	
	
	void takeallinputs(){};
	
}
