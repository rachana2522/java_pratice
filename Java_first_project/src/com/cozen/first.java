package com.cozen;

public class first extends Thread{
	private String name;
	public first(String name){
		this.name= name;
	}
	public  void run() {
		for(int i = 0;i<10;++i) {
			System.out.println(name+""+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new first("Thread1");
		Thread t2 = new first("Thread2");
		t1.start();
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException  e) {
			e.printStackTrace();
		}
		t2.start();
		

	}

}
