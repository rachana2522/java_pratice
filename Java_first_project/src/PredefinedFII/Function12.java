package PredefinedFII;

import java.util.function.Function;
//apply()
public class Function12 {

	public static void main(String[] args) {
		Function<String,String> f1=s->s.toUpperCase();
		System.out.println(f1.apply("Hello Cozentus"));

	}

}
