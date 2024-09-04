package edu.bit.byts.exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//throw new Exception("exception message");
		
		try(Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			if(a%2 != 0) {
				throw new Exception("Custom exception");
			}
			System.out.println("After input..." + a);
		}catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("end of main....");
	}
}