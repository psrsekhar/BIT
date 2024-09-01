class Animal{
	public void eat(){
		System.out.println("Animal is eating...");
	}

	public void sleep(){
		System.out.println("Animal is sleeping...");
	}	
}

class Lion extends Animal{
	public void roar(){
		System.out.println("Lion is roaring...");
	}
}

class Dog extends Animal{
	public void bark(){
		System.out.println("Dog is barking...");
	}
}

class HInheritance{
	public static void main(String[] args){
		Lion lion = new Lion();
		lion.eat();
		lion.roar();
		lion.sleep();
		Dog dog = new Dog();
		dog.eat();
		dog.bark();
		dog.sleep();
	}	
}