package practice_java;

public class pratice302 {
	public static void main(String args[]) {
		int number = 10;
		try {
		assert number>0:"value should be positive";
	}catch(AssertionError e) {
		System.out.println(e.getMessage());
	}
		System.out.println("value should be positive:"+number);
	
}

}
