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

class Cub extends Lion{
	public void play(){
		System.out.println("Cub is playing...");
	}
}

class MultiLevelInheritance{
	public static void main(String[] args){
		Cub cub = new Cub();
		cub.eat();
		cub.play();
		cub.roar();
		cub.sleep();
	}
}