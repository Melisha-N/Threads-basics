package com.wolken.wolkenapp.ThreadByImplementing;

public class MultipleOfFour2 extends Thread{
	@Override
	public void run() {

		System.out.println("Thread Id: "+ Thread.currentThread().getId());
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		
		int num=4;
		
		for (int i = 11; i <= 20; i++) {
			System.out.println(num + "*" + i + "=" + (num*i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("End of"+ Thread.currentThread().getName());
	}


}
