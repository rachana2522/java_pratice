package com.Arraystring;

public class tostring {
	  
		 int rollno;  
		 String name;  
		 String city;  
		  
		 tostring(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  
		   
		 public String toString(){//overriding the toString() method  
		  return rollno+" "+name+" "+city;  
		 }  
		 public static void main(String args[]){  
			 tostring s1=new tostring(101,"Raj","lucknow");  
			 tostring s2=new tostring(102,"Vijay","ghaziabad");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString()  
		 }  
		}  

