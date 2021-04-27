package com.wolken.wolkenapp.ThreadByImplementing;

public class MultipleOfFourTester {
	public static void main(String[] args) {
		System.out.println("Thread Id: "+ Thread.currentThread().getId());
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		
		System.out.println("Active number of threads:"+Thread.activeCount());
		
//		threads run simultaneously
//		MultipleOfFour1 four1 = new MultipleOfFour1();
//		MultipleOfFour2 four2 = new MultipleOfFour2();
//		
//		Thread thread1 = new Thread(four1);
//		thread1.start();
//		
//		Thread thread2 = new Thread(four2);
//		thread2.start();
		
//		Both threads run separately
		MultipleOfFour1 four1 = new MultipleOfFour1();
		Thread thread1 = new Thread(four1);
		thread1.start();
		MultipleOfFour2 four2 = new MultipleOfFour2();
		Thread thread2 = new Thread(four2);
		thread2.start();
		
		System.out.println("Active number of threads:"+Thread.activeCount());
		
		System.out.println("End of"+ Thread.currentThread().getName());

	}

}
