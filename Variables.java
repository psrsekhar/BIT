class Variables{
	public static void main(String[] args){
		int a = 10;//Local Variable
		System.out.println("Value in a:"+a);
		display();
		Test obj = new Test();//Object -> Local Reference
		obj.getValue();
		System.out.println("Value in b:"+obj.b);
		System.out.println("Value in d:"+obj.d);
	}
	
	public static void display(){
		System.out.println("in display()");
	}
}
class Test{
	public int b = 20;//Non-static Instance Variable
	static int d = 40;//static Instance Variable
	public void getValue(){
		int c = 30;//Non-static Local variable
		System.out.println("Value in b:" + b);
	}
}