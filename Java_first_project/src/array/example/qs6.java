//Write a Java program to find the index of an array element.
package array.example;

public class qs6 {
	public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
	
public static void main(String args[]) {
	int[] my_array = {25,14,65,34};
	System.out.println("Index positon of 25 is:" + findIndex(my_array,25));
	System.out.println("index positon of 65 is :" + findIndex(my_array,65));
}
}
