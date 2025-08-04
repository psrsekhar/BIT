class Food{
	private String name;
	private Integer category;
	private String ingredients;
	
	//default constructor
	Food(){
		System.out.println("Default constructor");
		this.name = "Dosa";
		this.category = 0;
		this.ingredients = "go to a hotel and get."; 
	}
	
	//parameterized constructor
	Food(String name, Integer category, String ingredients){
		System.out.println("Parameterized constructor");
		this.name = name;
		this.category = category;
		this.ingredients = ingredients;
	}
	
	//copy constructor
	Food(Food food){
		System.out.println("Copy constructor");
		this.name = food.name;
		this.category = food.category;
		this.ingredients = food.ingredients;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setCategory(Integer category){
		this.category = category;
	}
	
	public Integer getCategory(){
		return this.category;
	}

	public void setIngredients(String ingredients){
		this.ingredients = ingredients;
	}
	
	public String getIngredients(){
		return this.ingredients;
	}

	public void getFoodInfo(){
		System.out.println("Name: " + this.name + "\tCategory: " + this.category + "\tIngredients: " + this.ingredients);
	}
}

class Constructor{
	public static void main(String[] a){
		Food dosa = new Food();//default constructor
		dosa.getFoodInfo();
		
		Food biriyani = new Food("Biriyani", 1, "Rice, water, chicken, spices, salt, oil, onions, tomato, curd, ghee, ginger, garlic, mint");//paramterized constructor
		biriyani.getFoodInfo();
		
		dosa.setName("Parota");
		dosa.setCategory(0);
		dosa.setIngredients("Flour, water, salt, oil");		
		
		Food parota = new Food(dosa);//copy constructor -> copying from dosa object to parota
		parota.getFoodInfo();
	}
}