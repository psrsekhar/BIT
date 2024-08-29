import java.util.*;

class Arys{
	public static void main(String[] a){
		int[] marks = new int[3]; 
		
		marks[0] = 70;
		marks[1] = 90;
		marks[2] = 80;
		
		for(Integer mark: marks){
			System.out.println(mark);
		}
		
		int[] ids = {9879, 3548, 7755};
		int[] duplicates = {9879, 3548, 7755};
		System.out.println(Arrays.toString(ids));		
		Arrays.sort(ids);		
		int index = Arrays.binarySearch(ids, 3548);
		boolean isEqual = Arrays.equals(ids, duplicates);
		Arrays.fill(ids, 9);
		int[] copiedArray = Arrays.copyOf(ids, 7);
		int[] rangeArray = Arrays.copyOfRange(ids,1,2);
	}
}