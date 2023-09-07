package practice_java;

class animalll{
	public void move() {
		System.out.println("Hii welco,me");
	}
}

class  chetah extends animalll{
	public void move() {
		System.out.println("Hiii are you okay");
	}
}

public class hy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
animalll an = new animalll();
an.move();
chetah an1 = new chetah();
an1.move();
	}

}
