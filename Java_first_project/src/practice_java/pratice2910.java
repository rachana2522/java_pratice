//create one abstract clSS WITH TWO METHODS AND IMPLECT USING ANOTHER CLASS WHERE ONE METHOD  IS NUMBER IS REVERSE OR NOT IN ANOTHER METHOD CREATE A ARRAY USING INPUT AND TRAVERSEN THE ARRAY.
package practice_java;

import java.util.Scanner;

abstract class  Test
	{
	    abstract void palindrom();
	    abstract void traverse();
	}
	class Demo1 extends Test
	{


	    public void palindrom() {
	        int n =343; int rev=0;int r;int t;
	        t=n;
	        while(n>0)
	        {
	            r=n%10;
	            rev= rev*10+r;
	            n=n/10;
	        }
	        if(t==rev)
	        {
	            System.out.println("Number is palindrome");
	        }
	        else
	        {
	            System.out.println("Number is not  palindrome");    
	        }
	    }

	 

	    public void traverse() {


	        Scanner sc= new Scanner(System.in);
	        System.out.println("enter number of elements in array");
	        int m=sc.nextInt();
	        System.out.println("enter array elements");
	            int arr []= new int[m];

	        for(int i=0;i<m;i++)
	        {

	        arr[i]=sc.nextInt();
	                }
	        System.out.println("array elements are");
	        for(int i=0;i<m;i++)
	        {
	            System.out.println(arr[i]);

	 

	        }
	    }

	}

	 

	 

	public class pratice2910 {

	 

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Demo1 ob=new Demo1();
	        ob.palindrom();
	        ob.traverse();

	 

	    }

	 

	}