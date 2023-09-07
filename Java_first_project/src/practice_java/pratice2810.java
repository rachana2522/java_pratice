//Define a method that accepts an array of integers and returns the maximum value.If the array is empty, throw a 'NullPointerException'. Implement try-catch to handle the exception
package practice_java;

public class pratice2810 {
	    public static Integer findMaxValue(int[] array) {
	        if (array == null) {
	            throw new NullPointerException("Array cannot be null");
	        }
	        
	        if (array.length == 0) {
	            throw new NullPointerException("Array is empty");
	        }
	        
	        int max = array[0];
	        for (int num : array) {
	            if (num > max) {
	                max = num;
	            }
	        }
	        
	        return max;
	    }

	    public static void main(String[] args) {
	        int[] nums = { 12, 45, 6, 78, 23 };
	        
	        try {
	            int maxValue = findMaxValue(nums);
	            System.out.println("Maximum value: " + maxValue);
	        } catch (NullPointerException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	        
	        int[] emptyArray = {};
	        
	        try {
	            int maxValue = findMaxValue(emptyArray);
	            System.out.println("Maximum value: " + maxValue);
	        } catch (NullPointerException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}

