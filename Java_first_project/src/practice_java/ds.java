package practice_java;

class vehicle{
	public void drive(){
		System.out.println("Hii car");
	}
}
class Car extends vehicle{
	public void drive() {
		System.out.println("car hii");
	}
}

public class ds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               vehicle ve= new vehicle();
                Car car = new Car();
                   ve.drive();
                   car.drive();
	}

}
