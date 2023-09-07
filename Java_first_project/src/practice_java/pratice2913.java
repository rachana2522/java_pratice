//write a program that takes  a main string and substring as input and calculate the frequency of main string as substring
package practice_java;

import java.util.Scanner;

public class pratice2913 {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();
        System.out.print("Enter the substring: ");
        String subStr = sc.nextLine();
        int count = 0;
        for (int i = 0; i <= mainStr.length() - subStr.length(); i++) {
            if (mainStr.substring(i, i + subStr.length()).equals(subStr)) {
                count++;
            }
        }
        System.out.println("The frequency of \"" + subStr + "\" in \"" + mainStr + "\" is " + count);
    }
}