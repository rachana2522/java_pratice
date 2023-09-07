package assignment.com;

public class assignment11 {

	public static boolean isSorted(int[] arr , int index) {
		if(index <=1) {
			return true;
		}
		if(arr[index -1] < arr[index -2]) {
			return false;
		}
		return isSorted(arr,index-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] sortedArray = {1,3,5,7,9};
int[] unsoortedArray = {4,8,2,6,10};
System.out.println("is sortedarray sorted?" + isSorted(sortedArray,sortedArray.length));
System.out.println("is sortedarray sorted?" + isSorted(unsoortedArray,unsoortedArray.length));	
	}

}
