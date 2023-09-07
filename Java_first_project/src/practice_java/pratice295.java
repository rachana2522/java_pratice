//Create a program, having a method that takes an array and an index as parameters, and returns the element at that index. However, the method should throw an "IndexOutOfBoundsException", if the index is out of bounds. Utilize the 'throws' keyword to indicate this exception in the method signature.Demonstrate calling this method and handling the exception.
package practice_java;

public class pratice295 {

	public static int getElementAtIndex(int[]array,int index)
	throws IndexOutOfBoundsException{
		if(index <0 || index >= array.length) {
			throw new 
			IndexOutOfBoundsException("Index is out off bound");
		}
		return array[index];
	}
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50
		};
		try {
			int index = 2;
			int element = getElementAtIndex(numbers,index);
					
			   System.out.println("Element at index " + index + ": " + element);
			        } catch (IndexOutOfBoundsException e) {
			            System.out.println("Exception caught: " + e.getMessage());
			        }
			        
			        try {
			            int index = 20;
			            int element = getElementAtIndex(numbers, index);
			            System.out.println("Element at index " + index + ": " + element);
			        } catch (IndexOutOfBoundsException e) {
			            System.out.println("Exception caught: " + e.getMessage());
			        }
			    }
			}

	

