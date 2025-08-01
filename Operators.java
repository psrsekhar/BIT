class Operators{
	public static void main(String[] args) {
		
	}
	
	public static void instance(){
		String name = "Tamanna";
		//obj instanceof class/interface
		if(name instanceof String){
			System.out.println("is string");
		}else{
			System.out.println("not a string");
		}
		
		Operators obj = new Operators();
		if(obj instanceof Operators){
		}	
	}
	
	public static void shift(){
		byte a = 5, b = 2;
		System.out.println(a<<b);//left shift
		System.out.println(a>>b);//signed right shift
		System.out.println(a>>>b);//unassigned right shift	
	}
	
	public static void bitwise(){
		int a = -5, b = 8;
		System.out.println(a&b);
		System.out.println(true&false);
		System.out.println(true|false);
		System.out.println(~a);//2s complementof a
		//System.out.println(~true);//CE: ~ can not be used for boolean type
	}
	
	public static void relational(){
		String name1 = "Samantha";
		String name2 = "Samantha";
		String name3 = new String("Samantha");
		if(name1 == name2){
			System.out.println("Equal");//output
		}else{
			System.out.println("Not Equal");
		}
		if(name1 == name3){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");//output
		}		
		if(name1.equals(name3)){
			System.out.println("Equal");//output
		}else{
			System.out.println("Not Equal");
		}	
	}
	
	public static void arithmatic(){
		long a = 10;
		byte b = 20;
		long c = a+b;  //max(int, typeof a, type of b);
		System.out.println(c);
		int d = 40, e = 50;
		String name = "Samantha";
		System.out.println(d+e+name);
	}
}

/**
  int = int + int;
  int = byte + int;
  int = byte + byte;
  int = short + int;
  int = short + short;
  long = int + long;
  float = int + float;
  double = float + double;
  int = char + char;
  int = char + int;
  double = char + double;
  
		if(true == true)
		if(false != true)
			
		String name2 = "Samantha";
		String name3 = new String("Samantha");
		if(name2 == name3){
			System.out.println("Equal");//output
		}else{
			System.out.println("Not Equal");
		}
		
		0 0 0 0 0 1 0 1      5
		0 0 0 0 1 0 1 0  (5 << 1) => 10
		0 0 0 1 0 1 0 0  (5 << 2) => 20
*/