import java.util.Arrays;
class Array{
	public static void main(String[] args){
		int size = 5;
		String[] names = new String[size];
		names[0] = "Samantha";
		names[1] = "Trisha";
		names[2] = "what do you want?";
		
		for(String name: names){
			System.out.println(name);
		}
		
		for(int i=0; i<size; i++){
			System.out.println(names[i]);
		}
		
		//Lamda expression
		Arrays.stream(names).forEach(name -> System.out.println(name));		
		Arrays.stream(names).forEach(name -> System.out::println);
		
		int[] numbers = {5, 3, 4, 2, 1};
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(numbers.length);//integers
		names.length();//for strings
		
		names.sort();
		numbers.sort();
	}
}