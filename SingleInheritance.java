class Animal{
	private String name = "Animal";
	private Integer numberOfLegs;
	
	public void sleep(){
		System.out.println(this.name + " is sleeping......");
	}
	
	public void eat(){
		System.out.println(this.name + " is eating......");
	}	
}

class Lion extends Animal{	
	public void sound(){
		System.out.println("Lion is roaring......");
	}
	
	public void hunt(){
		System.out.println("Lion is hunting......");
	}
}

interface IForest{
	public void place();
}

class Forest implements IForest{
	@override
	public void place(){
		System.out.println("Animal is in Zoo......");
	}
	
	public void reserve(){
		System.out.println("Animal is in reserved Forest......");
	}
}

class SingleInheritance{
	public static void main(String[] a){
		IForest forest = new Forest();
		forest.place();
		/**
		Lion lion = new Lion();
		lion.sleep();
		lion.eat();
		lion.hunt();
		lion.sound();
		*/
	}
}