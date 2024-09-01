class Hotel{
	Cook cook;
	//Constructor injection
	public Hotel(Cook c){
		this.cook = c;
	}
	public void deliver(){
		cook.prepare();		
		System.out.print("Food is about to deliver....");		
	}
}
class Cook{
	public void prepare(){
		System.out.print("Food is cooking....");
	}

class Swiggy{
	
	public static void main(String[] a){
		Cook cook = new Cook();
		Hotel order = new Hotel(cook);
		order.deliver();
	}
}