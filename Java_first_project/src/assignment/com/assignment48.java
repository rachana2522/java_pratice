//Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order i.e., fill A with first p smallest elements and fill B with remaining elements.  

//Example:
//Input:
//int [] A = {1, 5, 6, 7, 8, 10}
//int[] B = {2, 4, 9}
//Output:
//Sorted Arrays:
//A: [1, 2, 4, 5, 6, 7]
//B: [8, 9, 10].

package assignment.com;

public class assignment48 {
	
	    public static void main(String[] args) {
	        int[] A = {1, 5, 6, 7, 8, 10};
	        int[] B = {2, 4, 9};

	        mergeSortedArrays(A, B);

	        System.out.println("Sorted Arrays:");
	        System.out.print("A: ");
	        printArray(A);
	        System.out.print("B: ");
	        printArray(B);
	    }

	    public static void mergeSortedArrays(int[] A, int[] B) {
	        int p = A.length;
	        int q = B.length;
	        int i = 0; // Index for array A
	        int j = 0; // Index for array B
	        int k = 0; // Index for merging

	        int[] tempA = new int[p];
	        System.arraycopy(A, 0, tempA, 0, p); // Copy A to tempA

	        while (i < p && j < q) {
	            if (tempA[i] < B[j]) {
	                A[k++] = tempA[i++];
	            } else {
	                A[k++] = B[j++];
	            }
	        }

	        while (i < p) {
	            A[k++] = tempA[i++];
	        }

	        while (j < q) {
	            A[k++] = B[j++];
	        }
	    }

	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}


