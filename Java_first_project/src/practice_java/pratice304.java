//create a program from temputure to faranide use assertion faranide result is correct or not?
package practice_java;

public class pratice304 {

	 public static double celsiusToFahrenheit(double celsius) {
	        return (celsius * 9 / 5) + 32;
	    }
	 public static void main(String args[]) {
		 double celsiusTemperature = 25.0; 
	        double expectedFahrenheit = 77.0; 
	        
	        double convertedFahrenheit = celsiusToFahrenheit(celsiusTemperature);

	        System.out.println("Celsius Temperature: " + celsiusTemperature);
	        System.out.println("Converted Fahrenheit: " + convertedFahrenheit);
	 
	
	 assert Math.abs(convertedFahrenheit - expectedFahrenheit)<0.01 :"Convertion result is incorrect" ;
	 System.out.println("Convertion result in incorrect");
}
	 
}