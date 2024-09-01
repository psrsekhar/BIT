interface Animal{
	public void eat();
	public void sleep();
}

interface Pet{
	public void bath();
}
class Dog implements Animal,Pet{
	//method overriding
	public void eat(){
		System.out.println("Dog is eating...");
	}	
	public void sleep(){
		System.out.println("Dog is sleeping...");
	}
	public void bath(){
		System.out.println("Dog is bathing...");
	}
}

class MInheritance{
	public static void main(String[] args){
		Dog dog = new Dog();
		dog.eat();
		dog.bark();
		dog.sleep();
		dog.bath();
	}
}