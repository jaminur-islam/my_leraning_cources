package com.pkg1;

public abstract class Company{
	private String name;
	private String address;
	private String contactnumber;
	private String jobcategory;  //hiring post
	private String requiredskill;
	private String requiredexperience;
	private String requiredqualification;
	
	
	public void setname(String n){
		name= n;
	}
	public String getname(){
		return name;
	}
	
	
	
	public void setaddress(String add){
		address = add;
	}
	public String getaddress(){
		return address;
	}
	
	
	
	public void setcontactnumber(String num){
		contactnumber = num;
	}
	public String getcontactnumber(){
		return contactnumber;
	}
	
	
	public void setjobcategory(String jc){
		jobcategory= jc;
	}
	public String getjobcategory(){
		return jobcategory;
	}
	
	
	
	public void setrequiredskill(String rs){
		requiredskill = rs;
	}
	public String getrequiredskill(){
		return requiredskill;
	}
	
	
	
	public void setrequiredexperience(String re){
		requiredexperience = re;
	}
	public String getrequiredexperience(){
		return requiredexperience;
	}
	
	
	public void setrequiredqualification(String rq){
		requiredqualification = rq;
	}
	public String getrequiredqualification(){
		return requiredqualification;
	}
	
	public void takeallinputs(){};
}