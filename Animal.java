class Lion{
	public void eat(){
		System.out.println("Lion is eating...");
	}
}

class Cub extends Lion{
	public void play(){
		System.out.println("Cub is playing...");
	}
}

class Animal{
	public static void main(String[] args){
		Cub cub = new Cub();
		cub.eat();
		cub.play();
	}
}