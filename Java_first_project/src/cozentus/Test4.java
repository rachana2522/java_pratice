package cozentus;
abstract class Bank {
	public abstract void getBalance();
}

class BankA extends Bank{
	int a = 100;
	public void getBalance(){
	
		System.out.println("Get balance: BankA "+a+"$");
	}	
}
class BankB{
	int b = 150;
	public void getBalance(){
	
		System.out.println("Get balance: BankB "+b+"$");
	}
	
}
class BankC{
	int c = 200;
	public void getBalance(){
	
		System.out.println("Get balance: BankC "+c+"$");
	}
	
}
public class Test4 {

	public static void main(String[] args) {
		BankA obj1 = new BankA();
		BankB obj2 = new BankB();
		BankC obj3 = new BankC();
		obj1.getBalance();
		obj2.getBalance();
		obj3.getBalance();
		

	}

}
