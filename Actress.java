class Actress{
	//Fileds or data
	String name;
	Integer age;
	String phoneNumber;
	
	//methods or behavior
	public void acting(){
		System.out.println("Acting in movies");
	}
	
	public void advertising(){
		System.out.println("Advertising....");
	}

	public void charity(){
		System.out.println("Helping others....");
	}
}

public class Movie{
	public static void main(String[] a){
		Actress firstActress = new Actress();
		firstActress.name = "Samantha";
		firstActress.age = 16;
		firstActress.phoneNumber = "+91-9876543210";
		
		firstActress.acting();
		firstActress.advertising();
		firstActress.charity();
		
		System.out.println("Name: " + firstActress.name);
	}
}