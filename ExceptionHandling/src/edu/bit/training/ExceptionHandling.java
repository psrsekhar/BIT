package edu.bit.training;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			int a = 10/0;
			sc= new Scanner(System.in);
		}finally {
			sc.close();
		}
	}

	public static void main() {
		main(10, 0);
		System.out.println("main method executed...");
	}

	public static void main(int a, int b) {
		
		try {
			String[] nameList = { "Monica", "Signature", "Teachers", "Black&White" };
			System.out.println(nameList[3]);
			try {
				Integer result = a / b;
			} catch (ArithmeticException ex) {
				ex.printStackTrace();
				System.out.println("Server is busy with internal exception.");
			}finally {
				System.out.println("main(10) method executed in finally...");
			}			
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array is busy. Please try again later.");
		}
	}
}