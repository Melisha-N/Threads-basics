package com.wolken.wolkenapp.ThreadByExtending;

public class MultipleOfTwo1 extends Thread{
	@Override
	public void run() {

		System.out.println("Thread Id: "+ Thread.currentThread().getId());
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		
		int num=2;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + (num*i));
		}
		
		System.out.println("End of"+ Thread.currentThread().getName());
	}

}

