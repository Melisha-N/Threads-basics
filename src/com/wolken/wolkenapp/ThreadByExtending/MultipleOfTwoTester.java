package com.wolken.wolkenapp.ThreadByExtending;

public class MultipleOfTwoTester {
	public static void main(String[] args) {
		System.out.println("Thread Id: "+ Thread.currentThread().getId());
		System.out.println("Thread Name: "+Thread.currentThread().getName());
//		Both threads run simultaneously
//		MultipleOfTwo1 two1 = new MultipleOfTwo1();
//		MultipleOfTwo2 two2 = new MultipleOfTwo2();
//		two1.start();
//		two2.start();
		
//		threads run separately
		MultipleOfTwo1 two1 = new MultipleOfTwo1();
		two1.start();
		
		MultipleOfTwo2 two2 = new MultipleOfTwo2();
		two2.start();
		
		System.out.println("End of"+ Thread.currentThread().getName());
	}

}
