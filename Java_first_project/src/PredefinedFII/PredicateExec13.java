package PredefinedFII;

import java.util.function.Predicate;

public class PredicateExec13 {
	
	
	public static void main(String[] args) {
		
		int [] x= {0,1,2,3,4,5,6,7,8,9,10};
		
		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer> p2=i->i>5;
		Predicate<Integer> p3=i->i<9;
		
		//.or() .and() .negate()
		//Print all Even Number or >5
           for(int y:x) {
        	   /*if(p1.and(p2).or(p3).test(y)) {
        		   System.out.println(y);
        	   }*/
        	   
        	   if(p1.negate().test(y)) {
        		   System.out.println(y);
        	   }
           }
           
		
	}
}
