//Write a Java program to check if a sub-array is formed by consecutive integers from a given array of integers.  

//Example:
//Input:
//nums = {2, 5, 0, 2, 1, 4, 3, 6, 1, 0}
//Output:
//The largest sub-array is [1, 7]
//Elements of the sub-array: 5 0 2 1 4 3 619. Write a Java program to create a base class Animal with methods eat () and sound (). Create three subclasses: Lion, Tiger, and Panther. Override the eat () method in each subclass to describe what each animal eats. In addition, override the sound() method to make a specific sound for each animal
package assignment.com;

public class assignment47 {
	    public static void main(String[] args) {
	        int[] nums = {2, 5, 0, 2, 1, 4, 3, 6, 1, 0};

	        int[] subarray = findLargestConsecutiveSubarray(nums);
	        if (subarray != null) {
	            System.out.print("The largest sub-array is [" + subarray[0] + ", " + subarray[1] + "]\nElements of the sub-array: ");
	            for (int i = subarray[0]; i <= subarray[1]; i++) {
	                System.out.print(nums[i] + " ");
	            }
	            System.out.println();
	        } else {
	            System.out.println("No consecutive sub-array found.");
	        }
	        
	        // Creating Animal subclasses
	        Lion lion = new Lion();
	        Tiger tiger = new Tiger();
	        Panther panther = new Panther();
	        
	        lion.eat();
	        lion.sound();
	        
	        tiger.eat();
	        tiger.sound();
	        
	        panther.eat();
	        panther.sound();
	    }

	    public static int[] findLargestConsecutiveSubarray(int[] nums) {
	        int n = nums.length;
	        int maxLen = 0;
	        int start = 0;

	        for (int i = 0; i < n - 1; i++) {
	            int min = nums[i];
	            int max = nums[i];
	            
	            for (int j = i + 1; j < n; j++) {
	                min = Math.min(min, nums[j]);
	                max = Math.max(max, nums[j]);
	                
	                if (max - min == j - i) {
	                    if (j - i > maxLen) {
	                        maxLen = j - i;
	                        start = i;
	                    }
	                }
	            }
	        }

	        if (maxLen == 0) {
	            return null;
	        }

	        return new int[]{start, start + maxLen};
	    }
	}

	class Animal {
	    public void eat() {
	        System.out.println("Animal is eating.");
	    }

	    public void sound() {
	        System.out.println("Animal makes a sound.");
	    }
	}

	class Lion extends Animal {
	    @Override
	    public void eat() {
	        System.out.println("Lion eats meat.");
	    }

	    @Override
	    public void sound() {
	        System.out.println("Lion roars.");
	    }
	}

	class Tiger extends Animal {
	    @Override
	    public void eat() {
	        System.out.println("Tiger eats meat and sometimes fish.");
	    }

	    @Override
	    public void sound() {
	        System.out.println("Tiger growls.");
	    }
	}

	class Panther extends Animal {
	    @Override
	    public void eat() {
	        System.out.println("Panther is a carnivore.");
	    }

	    @Override
	    public void sound() {
	        System.out.println("Panther makes a distinctive sound.");
	    }
	}


