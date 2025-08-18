package edu.bit.training.List;

import java.util.ArrayList;
import java.util.List;

public class AList {
	public static void main(String[] args) {
		ArrayList actressNames = new ArrayList(5);
		actressNames.add(10);
		actressNames.add("Samantha");		
		actressNames.add(2, "Teachers");
		
		List infoList = new ArrayList();
		infoList.add(10);
		infoList.addLast(20);//index based
		infoList.add("Samantha");
		
		for(int i=0; i<infoList.size();i++) {
			System.out.println(infoList.get(i));//index based
		}
		
		infoList.set(0,  "Trisha");
		infoList.remove(1);//index based
		infoList.remove("Trisha");//value based
		
		List<Integer> info = new ArrayList<Integer>();//Generic type
		info.add(10);
		info.addLast(20);
		//info.add("Samantha");	
		
		for(Integer o: info) {
			System.out.println(o);
		}
		
	}
}
