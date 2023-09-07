//Write a Java program that checks whether an array is negative dominant or not. If the array is negative dominant return true otherwise false.  

//Example:
//Original array of numbers:
//[1, -2, -5, -4, 3, -6]
//Check Negative Dominance in the said array! true.
package assignment.com;

public static boolean isNegativeDominant(int[] numbers) {
    int negativeCount = 0;
    int positiveCount = 0;

    for (int num : numbers) {
        if (num < 0) {
            negativeCount++;
        } else if (num > 0) {
            positiveCount++;
        }
    }

    return negativeCount > positiveCount;
}

public static void main(String[] args) {
    int[] numbers = {1, -2, -5, -4, 3, -6};
    
    System.out.println("Original array of numbers:");
    for (int num : numbers) {
        System.out.print(num + " ");
    }
    
    boolean1 isNegativeDominant = isNegativeDominant(numbers);
    
    System.out.println("\nCheck Negative Dominance in the said array! " + isNegativeDominant);
}
}