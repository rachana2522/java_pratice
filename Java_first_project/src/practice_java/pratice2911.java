//write a program that take a string that remove specific string using string builder
package practice_java;

import java.util.Scanner;

import array.example.main;

public class pratice2911 {
public static void main(String args[]) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter the string:");
	StringBuilder sb = new StringBuilder(sc.next());
	System.out.println("Enter the second string");
	StringBuilder sb1 = new StringBuilder(sc.next());
	String a = sb.toString();
	String b = sb1.toString();


    StringBuilder str2 = new StringBuilder(a.replace(b,""));
    System.out.println("modified string is "+str2);
	

                }

               }
