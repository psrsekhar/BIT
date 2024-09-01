class Animal{
	public void eat(){
		System.out.println("Animal is eating nonveg .....");
	}
}

class Elephant extends Animal{
	//overriding method
	public void eat(){
		System.out.println("Elephant is eating veg .....");
	}	
}

class MethodOverriding{
	public static void main(String[] a){
		Elephant e = new Elephant();
		e.eat();
		e.sleep();
		e.honk();
	}
}