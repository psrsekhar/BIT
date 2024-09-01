class MethodOverloading{
	public MethodOverloading(){
	}
	
	public MethodOverloading(Integer a){
	}
	
	public static void main(String[] a){
		System.out.println("In main(String[] a)");
		main();
		main(10);
	}
	
	public static void main(){
		System.out.println("In main()");
	}
	
	public static void main(Integer a){
		System.out.println("In main(Integer a)");
	}
}