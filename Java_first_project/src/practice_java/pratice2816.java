//Create a method that accepts a password as input and throws a 'SecurityException' if the password doesn't meet certain security criteria.Implement the method and demonstrate how to handle the security exception using a try-catch block.
package practice_java;


	class SecurityException extends Exception {
	    public SecurityException(String message) {
	        super(message);
	    }
	}

	public class pratice2816 {
	    public static void validatePassword(String password) throws SecurityException {
	        // Define security criteria
	        int minLength = 8;
	        boolean hasUppercase = false;
	        boolean hasLowercase = false;
	        boolean hasDigit = false;

	        if (password.length() < minLength) {
	            throw new SecurityException("Password is too short. Minimum length: " + minLength);
	        }

	        for (char c : password.toCharArray()) {
	            if (Character.isUpperCase(c)) {
	                hasUppercase = true;
	            } else if (Character.isLowerCase(c)) {
	                hasLowercase = true;
	            } else if (Character.isDigit(c)) {
	                hasDigit = true;
	            }
	        }

	        if (!hasUppercase || !hasLowercase || !hasDigit) {
	            throw new SecurityException("Password does not meet security criteria.");
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            String password = "SecureP@ssw0rd";
	            validatePassword(password);
	            System.out.println("Password is valid.");

	            String weakPassword = "weak";
	            validatePassword(weakPassword); // This will throw SecurityException
	        } catch (SecurityException e) {
	            System.out.println("Caught SecurityException: " + e.getMessage());
	        }
	    }
	}


