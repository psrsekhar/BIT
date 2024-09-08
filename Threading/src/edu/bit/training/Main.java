package edu.bit.training;

import java.util.Arrays;

import edu.bit.training.kfc.InvestmentOperation;
import edu.bit.training.kfc.SalesOperation;

public class Main {
	public static void main(String[] args) {
		SalesOperation sales = new SalesOperation(Arrays.asList(230, 456, 765, 234));
		InvestmentOperation investments = new InvestmentOperation(Arrays.asList(1230, 2456, 765, 234, 998, 9876, 987, 9876));
		
		sales.start();
		investments.start();
		try {
			sales.join();
			investments.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		Integer profit = sales.getSum() - investments.getSum();
		if(profit > 0) {
			System.out.println("Profit of: " + profit);
		}else {
			System.out.println("Loss of: " + profit);
		}
	}
	
	public static void lifeCycle() {
		System.out.println("Start of main().....");
		BGMI bgmi = new BGMI();
		Thread t = new Thread(bgmi, "Thread-bgmi");
		System.out.println("Thread : " + t.getName() + " is in NEW state....");
		t.start();
		System.out.println("Thread : " + t.getName() + " is in Runnable state....");
		try {
			t.join();
			System.out.println("Thread : " + t.getName() + " is terminated....");			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End of main().....");		
	}
	
	public static void extendThread() {
		//Instantiation of a thread
		Youtube youtube = new Youtube();
		//youtube.run();//general method call
		youtube.start();//creating a new thread			
	}
}