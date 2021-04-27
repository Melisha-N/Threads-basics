package com.wolken.wolkenapp.SynchronisationDemo;

public class ByStaticSynchronisation {
	public static void main(String[] args) {
		System.out.println("Thread Id: " + Thread.currentThread().getId());
		System.out.println("Thread Name: " + Thread.currentThread().getName());

		N1 n1 = new N1();
		N2 n2 = new N2();
		N3 n3 = new N3();
		N4 n4 = new N4();
		System.out.println(n1.getName()+":" + n1.getState());
		System.out.println(n2.getName()+":" + n2.getState());
		System.out.println(n3.getName()+":" + n3.getState());
		System.out.println(n4.getName()+":" + n4.getState());

		
		n1.start();
		n2.start();
		n3.start();
		n4.start();
		
		System.out.println("End of" + Thread.currentThread().getName());
		
	}

}

class N1 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread Id: " + Thread.currentThread().getId());
		System.out.println("Thread Name: " + Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName()+":" + Thread.currentThread().getState());

		Addition.addNumber(1);
		
		System.out.println("End of" + Thread.currentThread().getName());

	}
	
}

class N2 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread Id: " + Thread.currentThread().getId());
		System.out.println("Thread Name: " + Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName()+":" + Thread.currentThread().getState());

		Addition.addNumber(2);
		
		System.out.println("End of" + Thread.currentThread().getName());

	}
	
	}

class N3 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread Id: " + Thread.currentThread().getId());
		System.out.println("Thread Name: " + Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName()+":" + Thread.currentThread().getState());

		Addition.addNumber(3);
		
		System.out.println("End of" + Thread.currentThread().getName());

	}
	}
class N4 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread Id: " + Thread.currentThread().getId());
		System.out.println("Thread Name: " + Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName()+":" + Thread.currentThread().getState());

		Addition.addNumber(5);
		
		System.out.println("End of" + Thread.currentThread().getName());

	}
	}
//static synchronisation by synchronized method
//class Addition{
//	synchronized static void addNumber(int number) {
//		int temp = 0;
//		for (int i = 0; i < 10; i++) {		
//			temp = temp+number;
//			System.out.println("Number: "+temp);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//	}

//static synchronisation by synchronized block
class Addition{
	 static void addNumber(int number) {
		 synchronized (Addition.class) {
			 int temp = 0;
				for (int i = 0; i < 10; i++) {		
					temp = temp+number;
					System.out.println("Number: "+temp);
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
