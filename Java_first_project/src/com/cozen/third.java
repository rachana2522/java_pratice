//create a program which will take positive integer input using multithreading technique we have to get  printnumber out of the positiive input and check the input positive or not
package com.cozen;
import java.util.Scanner;

public class third { 

    public static void main(String[] args) {
       
        Thread inputThread = new Thread(new InputRunnable());
        Thread checkThread = new Thread(new CheckPositiveRunnable());
        Thread printThread = new Thread(new PrintNumberRunnable());

        
        inputThread.start();
        checkThread.start();
        printThread.start();
    }
}

class InputRunnable implements Runnable {
 
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int input = scanner.nextInt();
        SharedData.setInput(input);
    }
}

class CheckPositiveRunnable implements Runnable {
    
    public void run() {
        int input = SharedData.getInput();
        assert input > 0 : "Input is not a positive integer!";
        SharedData.setPositive(true);
    }
}

class PrintNumberRunnable implements Runnable {
    
    public void run() {
        while (!SharedData.isPositive()) {
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int input = SharedData.getInput();
        System.out.println("The positive integer you entered is: " + input);
    }
}

class SharedData {
    private static int input;
    private static boolean positive = false;

    public static synchronized int getInput() {
        return input;
    }

    public static synchronized void setInput(int input) {
        SharedData.input = input;
    }

    public static synchronized boolean isPositive() {
        return positive;
    }

    public static synchronized void setPositive(boolean positive) {
        SharedData.positive = positive;
    }
}



   