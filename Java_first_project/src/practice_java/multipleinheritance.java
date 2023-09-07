package practice_java;

class parent{
	void diff() {
		System.out.println("This is different");
	}

	void eval() {
		// TODO Auto-generated method stub
		
	}

	void cal() {
		// TODO Auto-generated method stub
		
	}
}
class child1 extends parent{
	void eval() {
		System.out.println("This is evalution");
	}
}

class child2 extends child1{
	public static child2 obj1;

	void cal() {
		System.out.println("This is calution");
	}
}
public class multipleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child1 obj = new child1();
		child2.obj1 = new child2();
		obj.eval();
		obj.cal();
		obj.diff();
		
		
	}

}
