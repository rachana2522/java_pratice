package cozentus;
abstract class Ban{
	public abstract void getBalance();
	
}
class bankd extends Ban{
	int d = 100;
	public void getBalance(){
	
	System.out.println("Get balance:bankA "+d+"$");
}
	
}
class banke {
	int e = 150;
	public void getBalance(){
	
	System.out.println("Get balance:bankA "+e+"$");
}
	
}
class bankf {
	int f = 200;
	public void getBalance(){
	
	System.out.println("Get balance:bankA "+f+"$");
}
	
	}
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankd obj= new bankd();
		banke obj1 = new banke();
		bankf obj2 = new bankf();
		obj.getBalance();
		obj1.getBalance();
		obj2.getBalance();

	}

}
