class Animal{
	private String name = "Animal";	
	public void romance(){
		System.out.println(this.name + " is romancing......");
	}	
}

class Lion extends Animal{	
	public void sound(){
		System.out.println("Lion is roaring......");
	}
}

class Cub extends Lion{
	public void play(){
		System.out.println("Cub is playing......");
	}	
}

class Elephant extends Animal{
	public void sound(){
		System.out.println("Elephant is trumpet......");
	}
	
	public void eat(){
		System.out.println("Elephant is eating veg......");
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

		Cub cub = new Cub();
		cub.play();
		cub.sleep();
		cub.eat();
		cub.run();
		cub.hunt();
		cub.sound();
		cub.romance();
	}
}