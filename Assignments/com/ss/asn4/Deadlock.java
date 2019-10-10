package com.ss.asn4;

public class Deadlock {
	public static Object instruction1 = new Object();
	public static Object instruction2 = new Object();

	public static void main(String[] args) {
		FirstThread T1 = new FirstThread();
		SecondThread T2 = new SecondThread();
	    T1.start();
	    T2.start();

	}
	private static class FirstThread extends Thread {  
		public void run() {
	         synchronized (instruction1) {
	        	 
	            System.out.println("FirstThread: Obtain first instruction ");
	            
	            try { Thread.sleep(10); }
	            catch (InterruptedException e) {}
	            System.out.println("FirstThread: Waiting for second instruction  which SecondThread has  ");
	            
	            synchronized (instruction2) {
	               System.out.println("SecondThread: Obtain second instruction ");
	            }
	         }
	      }
	   }
	
	private static class SecondThread extends Thread {
		public void run() {
	         synchronized (instruction2) {
	            System.out.println("SecondThread: Obtain first instruction");
	            
	            try { Thread.sleep(10); }
	            catch (InterruptedException e) {}
	            System.out.println("SecondThread: Waiting for second instruction  which FirstThread has  ");
	            
	            synchronized (instruction1) {
	               System.out.println("SecondThread: Obtain second instruction");
	            }
	         }
	      }
	   }
	
	
	
}
