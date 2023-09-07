//create a program that find longest palingromilc substring within the a given string
package practice_java;

import java.util.Scanner;


		public interface pratice2914 {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String str = sc.nextLine();
		        String longestPalindrome = "";
		        for (int i = 0; i < str.length(); i++) {
		            for (int j = i + 1; j <= str.length(); j++) {
		                String substring = str.substring(i, j);
		                if (isPalindrome(substring) && substring.length() > longestPalindrome.length()) {
		                    longestPalindrome = substring;
		                }
		            }
		        }
		        System.out.println("The longest palindromic substring in \"" + str + "\" is \"" + longestPalindrome + "\".");
		    }

		    public static boolean isPalindrome(String str) {
		        int left = 0;
		        int right = str.length() - 1;
		        while (left < right) {
		            if (str.charAt(left) != str.charAt(right)) {
		                return false;
		            }
		            left++;
		            right--;
		        }
		        return true;
		    }
		}
