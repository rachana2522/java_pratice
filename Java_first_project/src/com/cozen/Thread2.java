package com.cozen;

public class Thread2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				
				int i =0;
				for(i = 0; i<10;i++) {
					System.out.println("this is thread"+i);
				}
			}	
	};
	
Thread t1 = new Thread(r1);
t1.start();

	}
}

		
		
		



