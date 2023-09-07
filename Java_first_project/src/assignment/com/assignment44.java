//Write a Java program to replace every element with the next greatest element (from the right side) in a given array of integers.
//There is no element next to the last element, therefore replace it with -1.

package assignment.com;
public class assignment44 {

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 10, 8};
        replaceWithNextGreatest(nums);

        System.out.println("Array after replacement:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void replaceWithNextGreatest(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return;
        }

        int max = nums[n - 1];
        nums[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {
            int temp = nums[i];
            nums[i] = max;
            max = Math.max(max, temp);
        }
    }
}


