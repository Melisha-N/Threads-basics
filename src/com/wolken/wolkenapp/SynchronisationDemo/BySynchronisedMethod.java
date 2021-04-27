package com.wolken.wolkenapp.SynchronisationDemo;

public class BySynchronisedMethod {
	public static void main(String[] args) {
		System.out.println("Thread Id: " + Thread.currentThread().getId());
		System.out.println("Thread Name: " + Thread.currentThread().getName());

		Table t = new Table(); //one object -- (shared resrc)
		Thread1 thread1 = new Thread1(t);
		System.out.println("Thread1 State: " + thread1.getState());
		Thread2 thread2 = new Thread2(t);
		System.out.println("Thread2 State: " + thread2.getState());
		thread1.start();
		thread2.start();

		System.out.println("End of" + Thread.currentThread().getName());
	}
}

class Thread1 extends Thread {
	Table t;

	public Thread1(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		System.out.println("Thread Id: " + Thread.currentThread().getId());
		System.out.println("Thread Name: " + Thread.currentThread().getName());
		System.out.println("Thread1 State: " + Thread.currentThread().getState());
		t.tableOf(2);
		System.out.println("End of" + Thread.currentThread().getName());

	}
}

class Thread2 extends Thread {
	Table t;

	public Thread2(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		System.out.println("Thread Id: " + Thread.currentThread().getId());
		System.out.println("Thread Name: " + Thread.currentThread().getName());
		System.out.println("Thread2 State: " + Thread.currentThread().getState());
		t.tableOf(4);
		System.out.println("End of" + Thread.currentThread().getName());

	}
}

class Table { //shared resrc
	synchronized void tableOf(int tableOf) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(tableOf + "*" + i + "=" + (tableOf * i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
