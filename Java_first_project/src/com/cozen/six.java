package com.cozen;


class Daemon12 implements Runnable{
	public void run () {
		while(true) {
			System.out.println("daomen thread is running");
			System.out.println(Thread.currentThread().isDaemon());
			try {
				Thread.sleep(1000);}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class six {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Thread t = new Thread(new Daemon12());
      t.setDaemon(true);
      t.start();
      try {
    	  Thread.sleep(5000);}
      catch(InterruptedException e) {
    	  e.printStackTrace();
      }
      System.out.println("main thread existing");
      System.out.println(Thread.currentThread().isDaemon());
	}

}
