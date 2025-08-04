/**
class Animal{
	private String name = "Animal";
	private Integer numberOfLegs;
	
	public void sleep(){
		System.out.println(this.name + " is sleeping......");
	}	
}
*/

interface IAnimal{
	public void sleep();
}

class Lion implements IAnimal{	
	public void sound(){
		System.out.println("Lion is roaring......");
	}
	
	public void hunt(){
		System.out.println("Lion is hunting......");
	}
	
	public void sleep(){
		System.out.println("Lion is sleeping......");
	}
}

class Elephant implements IAnimal{
	public void sound(){
		System.out.println("Elephant is trumpet......");
	}
	
	public void eat(){
		System.out.println("Elephant is eating veg......");
	}
	
	public void sleep(){
		System.out.println("Lion is sleeping......");
	}	
}

class HInheritance{
	public static void main(String[] a){
		Lion lion = new Lion();
		lion.sleep();
		lion.eat();
		lion.run();
		lion.hunt();
		lion.sound();
		lion.romance();
		
		Elephant elephant = new Elephant();
		elephant.sleep();
		elephant.eat();
		elephant.run();
		elephant.sound();
		elephant.romance();
	}
}