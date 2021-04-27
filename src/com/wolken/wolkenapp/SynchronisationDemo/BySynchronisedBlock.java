package com.wolken.wolkenapp.SynchronisationDemo;

public class BySynchronisedBlock {
	public static void main(String[] args) {
		System.out.println("Thread Id: " + Thread.currentThread().getId());
		System.out.println("Thread Name: " + Thread.currentThread().getName());

		Multiple multiple = new Multiple(); //one object -- (shared resrc)
		T1 t1 = new T1(multiple);
		System.out.println(t1.getName()+":" + t1.getState());
		T2 t2 = new T2(multiple);
		System.out.println(t2.getName()+ ":"+ t2.getState());

		t1.start();
		t2.start();

		System.out.println("End of" + Thread.currentThread().getName());

	}
}

class T1 extends Thread {
	Multiple multiple;

	public T1(Multiple multiple) {
		this.multiple = multiple;
	}

	@Override
	public void run() {
		System.out.println("Thread Id: " + Thread.currentThread().getId());
		System.out.println("Thread Name: " + Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName()+":"+ Thread.currentThread().getState());

		multiple.multipleOf(2);
		
		System.out.println("End of" + Thread.currentThread().getName());

	}
	
}

class T2 extends Thread {

	Multiple multiple;

	public T2(Multiple multiple) {
		this.multiple = multiple;
	}

	@Override
	public void run() {
		System.out.println("Thread Id: " + Thread.currentThread().getId());
		System.out.println("Thread Name: " + Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName()+":"+ Thread.currentThread().getState());

		multiple.multipleOf(4);
		
		System.out.println("End of" + Thread.currentThread().getName());

	}
}

class Multiple { //shared resource
	void multipleOf(int multipleOf) {
		synchronized (this) { //Resource is Multiple, and its it is also our current class so we pass "this" in parameter 
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(multipleOf + "*" + i + "=" + (multipleOf * i));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		}
	}
}
}