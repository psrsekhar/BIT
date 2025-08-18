package edu.bit.training;

public class LifeCycle extends Thread {
	private static final Object lock = new Object();
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": is in : " + Thread.currentThread().getState());
		
		System.out.println(Thread.currentThread().getName() + ": is in Running state");
		try {
			Thread.sleep(500);//Timed waiting
			System.out.println(Thread.currentThread().getName() + ": is in Timed waiting state");
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		//Blocked waiting
		synchronized (lock) {
			System.out.println(Thread.currentThread().getName() + ": is in Blocked waiting state");
		}
		System.out.println(Thread.currentThread().getName() + ": is in Terminated state");
	}
}
