interface Animal{
	public void eat();
	public void sleep();
}

interface Pet{
	public void bath();
}

class Dog implements Animal,Pet{
	public void eat(){
		System.out.println("Dog is eating...");
	}
	
	public void sleep(){
		System.out.println("Dog is sleeping...");
	}
	
	public void bath(){
		System.out.println("Dog is bathing...");
	}
	
	public void bark(){
		System.out.println("Dog is barking...");
	}
}

class Lion implements Animal{
	public void eat(){
		System.out.println("Dog is eating...");
	}
	
	public void sleep(){
		System.out.println("Dog is sleeping...");
	}
}

class Parrot implements Pet{
	public void bath(){
		System.out.println("Dog is bathing...");
	}		
}

class HybInheritance{
	public static void main(String[] args){
	}
}