package com.Arraystring;

public class Stringcompare {

//	 By Using equals() Method
//	 The String class equals() method compares the original content of the string. It compares values of string for equality. String class provides the following two methods:
//
//
//	 public boolean equals(Object another) compares this string to the specified object.
//	 public boolean equalsIgnoreCase(String another) compares this string to another string, ignoring case.
	  
//	public static void main(String args[]){  
//	    String s1="Sachin";  
//	    String s2="Sachin";  
//	    String s3=new String("Sachin");  
//	    String s4="Saurav";  
//	    System.out.println(s1.equals(s2));//true  
//	    System.out.println(s1.equals(s3));//true  
//	    System.out.println(s1.equals(s4));//false  

	
	
//	    By Using == operator
//	    		The == operator compares references not values.

	    	
//	    		 public static void main(String args[]){  
//	    		   String s1="Sachin";  
//	    		   String s2="Sachin";  
//	    		   String s3=new String("Sachin");  
//	    		   System.out.println(s1==s2);//true (because both refer to same instance)  
//	    		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
	   
	
	
	    		   
	    		   
//	By Using compareTo() method
//	The String class compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.
//
//	Suppose s1 and s2 are two String objects. If:
//
//	s1 == s2 : The method returns 0.
//	s1 > s2 : The method returns a positive value.
//	s1 < s2 : The method returns a negative value.		   
	    	
	
	
	public static void main(String args[]){  
		   String s1="Sachin";  
		   String s2="Sachin";  
		   String s3="Ratan";  
		   System.out.println(s1.compareTo(s2));//0  
		   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
		   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
	    		   
	    		   
	    		   
	    		   
	    		   
	    		   
	    		   
	    		}    
	    
	    
	    
	    
	    
	    
	    
	  }  
	
	
	
	
	
	
	
	
	
	
	  


