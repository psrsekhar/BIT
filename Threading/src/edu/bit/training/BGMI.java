package edu.bit.training;

public class BGMI implements Runnable  {
	@Override
	public void run() {
		System.out.println("Thread : " + Thread.currentThread().getName() + " is in Running state....");
		try {
			Thread.sleep(1000);
			System.out.println("Thread : " + Thread.currentThread().getName() + " is in timed waiiting state....");
			process(Thread.currentThread());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread : " + Thread.currentThread().getName() + " is about to Terminate....");
	}
	public void process(Thread t) {
		System.out.println("Thread : " + t.getName() + " is in waiiting state....");		
	}
}