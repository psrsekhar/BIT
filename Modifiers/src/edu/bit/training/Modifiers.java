package edu.bit.training;

public class Modifiers{

	public static void main(String[] args) {
		int[] investmentList = {10, 200, 3000, 40000};
		int[] billList = {432, 456, 653, 23456, 632, 245, 87654, 123456};
		
		int investmentSum = 0, billSum = 0;
		
		for(int investment: investmentList) {
			investmentSum += investment;
		}
		
		for(int bill: billList) {
			billSum += bill;
		}
		
		System.out.println("Profit: " + (billSum - investmentSum));
		
	}
}