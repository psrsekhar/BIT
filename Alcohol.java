class Alcohol{
	
	public static final void alcohol(){
		System.out.println("generating alcohol.......");
	}
	
	public void beer(){
		System.out.println("Processing beer.......");
	}
	
	public void wine(){
		System.out.println("Processing beer.......");
	}
	
	public void Vodka(){
		System.out.println("Processing vodka.......");
	}
}
class Main{
		public static void main(String[] args){
			Alcohol kf = new Alcohol();
			kf.beer();
			
			Alcohol.alcohol();
		}
}