//create a program for multithreading which will show if both are showing same resourses then it show you 0 resourse
package com.cozen;


class prominent5{
	private int count;
	
	public void addOn() {
		count++;
	}
	public int getAddOn() {
		
		return count;
	}
}
	class Implement1 extends Thread{
		
		private prominent5 prominent;
		public Implement1(prominent5 prominent) {
			this.prominent = prominent;
		}
		public void run() {
			for(int i = 0; i<5;++i) {
				prominent.addOn();
				
			}
	
		}
		}


public class fouth {
	public static void main(String[] args) {
		prominent5  prominent = new prominent5();
		Implement1 ip = new Implement1(prominent);
		
		Thread thread1 = new Thread(ip);
		Thread thread2 = new Thread(ip);
		
		thread1.start();
		thread2.start();
		
		
		
		System.out.println("final count"+prominent.getAddOn());
		
		
	}

}
	





	    