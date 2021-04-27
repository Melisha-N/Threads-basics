package com.wolken.wolkenapp.ThreadByExtending;

public class MultipleOfTwo2 extends Thread {
	@Override
	public void run() {

		System.out.println("Thread Id: "+ Thread.currentThread().getId());
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		
		int num=2;
		
		for (int i = 11; i <= 20; i++) {
			System.out.println(num + "*" + i + "=" + (num*i));
		}
		
		System.out.println("End of"+ Thread.currentThread().getName());
	}


}
