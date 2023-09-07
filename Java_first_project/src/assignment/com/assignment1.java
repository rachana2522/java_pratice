//Write a Java program that returns the missing letter from an array of increasing letters (upper or lower). Assume there will always be one omission from the array.  

//Example:
//Original array of elements:
//[p, r, s, t]

package assignment.com;

public class assignment1 {
public static char missingletter1(char[] letters) {
	for(int i =1;i<letters.length;i++) {
		if(letters[i]-letters[i-1]!=1) {
			return(char)(letters[i-1]+1);
		}
	}
	return '0';
}
	public static void main(String[] args) {
		
    char[] letters = {'P','R','S','T'};
    char missingletter = missingletter1(letters);
    System.out.println("original array");
    for(char letter:letters) {
    	System.out.print(letter+"");
    }
    
    System.out.println("\nMissing letter: " + missingletter);

    switch (missingletter) {
        case 'a':
        case 'A':
            System.out.println("The missing letter is 'a' or 'A'.");
            break;
        case 'z':
        case 'Z':
            System.out.println("The missing letter is 'z' or 'Z'.");
            break;
        default:
            System.out.println("The missing letter is: " + missingletter);
            break;
    }
}
}

