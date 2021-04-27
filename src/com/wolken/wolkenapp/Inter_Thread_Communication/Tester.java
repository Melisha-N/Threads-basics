package com.wolken.wolkenapp.Inter_Thread_Communication;
public class Tester {
	public static void main(String[] args) {
		Grocery grocery = new Grocery();
		Thread1 thread1 = new Thread1(grocery);
		Thread2 thread2 = new Thread2(grocery);
		
		thread1.start();
		thread2.start();

		
	}

}
class Thread1 extends Thread{
	Grocery grocery;
	
	public Thread1(Grocery grocery) {
		this.grocery = grocery;

	}
	@Override
	public void run() {
		grocery.purchaseGrocery(5);
	}
	
	
}

class Thread2 extends Thread{
	Grocery grocery;

	public Thread2(Grocery grocery) {
		this.grocery = grocery;

	}
	@Override
	public void run() {
		grocery.waitingForSixAM();

	}		
	
}


class Grocery{
	int start = 6;
	int end = 10;
	int currentTime;
	
	synchronized void purchaseGrocery(int currentTime) {
		this.currentTime = currentTime;
		System.out.println("Going to Purchase Grocery!");
//		System.out.println("currentTime:"+this.currentTime);
		if(this.currentTime  < start || this.currentTime  > end) {
			System.out.println("Inside if()");
			try {
				this.wait();
//				System.out.println("Executing wait()");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			System.out.println("Grocery Purchasing Compleleted!!");
		
	}
	
	synchronized void waitingForSixAM() {
		System.out.println("Waiting for 6AM");
//		System.out.println(this.currentTime);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Current Time is 6AM");
		notify();
		
	}
	
}