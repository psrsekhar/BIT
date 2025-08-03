class Actress{
	//Fileds or data
	public String name;
	public Integer age;
	public Integer numberOfMovies;
	private String phoneNumber;
	private String address;
	private Integer salary;
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
		firstActress.address = "My Home";
		firstActress.salary = 987654;
		firstActress.numberOfMovies = 999;
		System.out.println("Name: " + firstActress.name + "\taddress: " + firstActress.address);
	}
}