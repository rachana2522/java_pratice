package PredefinedFII;

import java.util.function.Predicate;

public class PredicateExec {

	public static void main(String[] args) {
		
         /* Predicate<Integer> p=i->i%2==0;
          System.out.println(p.test(20)); //Boolean
          System.out.println(p.test(23));*/
		
//		String [] s1= {"Dillip","Aditya","Pallabi","Gourish","Rachana"};
//		Predicate<String> p1=s ->s.length()%2==0;
//		
//		for(String ss:s1) {
//			if(p1.test(ss))
//			{
//				System.out.println(ss);
//			}
			
			String [] s2 = {"DS" ,"SD","PA","HO"};
			Predicate<String> p2 = s ->s.length()%2==0;
			
			for( String sp:s2) {
				if(p2.test(sp))
				{
					System.out.println(sp);
				}
			}
			
		}
				
	}

