// using thread synchttronization concept  create  thread synchronition senario where will be consumer and producer which imployes tow method wait() and notify()
package com.cozen;
import java.util.LinkedList;

	class SharedBuffer {
	    private LinkedList<Integer> buffer = new LinkedList<>();
	    private int capacity;

	    public SharedBuffer(int capacity) {
	        this.capacity = capacity;
	    }

	   public void produce() throws InterruptedException{
	    	 int item = 0;
	    	 while(true) {
	    		 synchronized(this) {
	    			 while(buffer.size()== capacity) {
	    				 wait();
	    			 }
	    			 System.out.println("producer waiting:"+item);
	    			 buffer.add(item++);
	    			 notify();
	    			 Thread.sleep(1000);
	    		 }
	    	 }
	     
	   }
	   
	   
	   
	  
		public void consume() throws InterruptedException {
	        while (true) {
	            synchronized (this) {
	                while (buffer.isEmpty()) {
	                    
	                    wait();
	                }

	                int item = buffer.removeFirst();
	                System.out.println("Consumer consumes: " + item);
	                notify(); 
	                Thread.sleep(1000); 
	            }
	        }
	    }
	}
	
	
public class five {
	    public static void main(String[] args) {
	        SharedBuffer sharedBuffer = new SharedBuffer(5);

	        Thread producerThread = new Thread(() -> {
	        	
	      
	            try {
	                sharedBuffer.produce();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        Thread consumerThread = new Thread(() -> {
	            try {
	                sharedBuffer.consume();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        producerThread.start();
	        consumerThread.start();
	    }
	}


