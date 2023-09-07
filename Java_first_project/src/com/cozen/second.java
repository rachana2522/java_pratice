// write a program to sort an array using multithread.
package com.cozen;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Create and start two threads
		        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
		        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

		        thread1.start();
		        thread2.start();

		        try {
		        	thread1.join();
		        	thread2.join();
		        }
		        catch(InterruptedException e) {
		        	e.printStackTrace();
		        }
		       

		        System.out.println("Both threads have finished.");
		    }
		}

		class MyRunnable implements Runnable {
		    private String name;

		    public MyRunnable(String name) {
		        this.name = name;
		    }

		    @Override
		    public void run() {
		        System.out.println(name + " is running.");
		        try {
		            // Simulate some work
		            Thread.sleep(2000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		        System.out.println(name + " has finished.");
		    }
		

		
	}


