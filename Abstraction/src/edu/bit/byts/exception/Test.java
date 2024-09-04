package edu.bit.byts.exception;

import java.util.Scanner;

public class Test {
	private Scanner sc;

	public void input() {
		System.out.println("In input()....");
		operation();
		System.out.println("After operation()....");
	}

	public void operation() {
		int[] name = {};
		System.out.println(name[0]);
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("After a...");
		sc.close();
	}
}
