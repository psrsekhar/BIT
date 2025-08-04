interface Animal{
	public void eat();
}
interface Pet extends Animal{
	public void bath();
}
class Dog implements Pet{
	Dog(){
		this();
	}
	
	public void eat(){
		System.out.println("Dog is eating......");
	}
	
	public void bath(){
		System.out.println("Dog is bathing......");
	}	
}
class MInheritance{
	public static void main(String[] a){
		Dog dog = new Dog();
		dog.eat();
		dog.bath();
	}
}