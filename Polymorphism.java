/**
interface Vehicle{
	public void tyres();
}
*/
class Vehicle{
	public void move(){
		System.out.println("Vehicle is moving....");
	}
	public void tyres(){
		System.out.println("Vehicle have 4 tyres....");
	}	
}

class Bike extends Vehicle{
	//method overriding
	public void tyres(){
		System.out.println("Bike have 2 tyres....");
	}
}

//class Car implements Vehicle{}

class Polymorphism{
	//method overloading
	public static void main(){
		System.out.println("In main()");
	}	
	
	public static void main(int a){
		System.out.println("In main(int a)");
	}

	public static void main(String name){
		System.out.println("In main(String name)");
	}	
	
	public static void main(String[] args){
		System.out.println("In main(String[] args)");
		main();
		main(10);
		main("Samantha");
		
		Bike bike = new Bike();
		bike.tyres();
	}
}