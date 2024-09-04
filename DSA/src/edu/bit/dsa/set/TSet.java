package edu.bit.dsa.set;

import java.util.SortedSet;
import java.util.TreeSet;


public class TSet {

	public static void main(String[] args) {
		SortedSet<Integer> productIdList = new TreeSet<Integer>();
		productIdList.add(107589);
		productIdList.add(107599);
		productIdList.add(107590);
		productIdList.add(107591);
		
		System.out.println(productIdList.tailSet(107585));
		System.out.println(productIdList.headSet(107590));
		
		
		System.out.println(productIdList);
	}
}