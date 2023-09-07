//Write a Java program that reads a positive integer and count the number of digits the number (less than ten billion) has.

//Test Data
//Input an integer number less than ten billion: 125463
//Expected Output:
//
//Number of digits in the number: 6

package assignment.com;
import java.util.Scanner;

public class assignment35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer number less than ten billion: ");
        long number = scanner.nextLong();

        if (number >= 0 && number < 10000000000L) {
            int count = countDigits(number);
            System.out.println("Number of digits in the number: " + count);
        } else {
            System.out.println("Number is not within the valid range.");
        }

        scanner.close();
    }

    public static int countDigits(long number) {
        if (number == 0) {
            return 1; // Special case for 0
        }

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}


