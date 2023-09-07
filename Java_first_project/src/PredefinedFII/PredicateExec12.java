package PredefinedFII;

import java.util.ArrayList;
import java.util.function.Predicate;


class User{
	String name;
	double salary;
	public User(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
}
public class PredicateExec12 {
	public static void main(String[] args) {
		ArrayList<User>  al= new ArrayList<>();
		al.add(new User("Tuluu",50000));
		al.add(new User("Kulu",12000));
		al.add(new User("Chulu",28000));
		al.add(new User("Lulu",45000));
		//Predicate Impl
		Predicate<User> pd=p->p.salary>=30000 && p.name.length()%2==0;
		
		
		for(User u1:al) {
			if(pd.test(u1)) {
			System.out.println(u1.name +" : "+u1.salary);
			}
		}
		
	}

}
