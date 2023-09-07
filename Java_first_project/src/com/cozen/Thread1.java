package com.cozen;

public class Thread1 implements Runnable{

	@Override
	public void run() {
		int i =0;
		for(i = 0; i<10;i++) {
			System.out.println("this is thread"+i);
		}
		
	}
	

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread tx = new Thread(t1);
		tx.start();
        
	}
}
