interface IAnimal{
	public void eat();//abstract method
}
class Animal implements IAnimal{
	//concrete method
	public void eat(){
		System.out.print("eating...");
	}
	
	public void display(){
		System.out.print("display...");
	}
}
class Main{
	public static void main(String[] args){
		//abstraction: Parent reference with child object
		IAnimal lion = new Animal();
		lion.eat();
		lion.sleep();		
	}	
}