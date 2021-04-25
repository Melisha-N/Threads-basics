package com.wolken.wolkenapp.Utilities;

public class UtilityDemo {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Inside Utility Demo");
		System.out.println("Active number of threads:"+Thread.activeCount());
		
		Thread thread = Thread.currentThread();
		
		System.out.println("Thread Id: "+ thread.getId());
		System.out.println("Thread Name: "+ thread.getName());
		System.out.println("Thread Priority: "+ thread.getPriority());
		System.out.println("Thread State: "+ thread.getState());
		
		System.out.println("Wait:");
//		thread.wait(1000); ---//getting an error
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.println("hello "+i);
			Thread.sleep(1000);
//			System.out.println("Thread State: "+ thread.getState());
		}
//		System.out.println("Thread State: "+ thread.getState());
		System.out.println("End of Utility Demo");
//		System.out.println("Thread State: "+ thread.getState());
	}
}
