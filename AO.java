interface IAO{
	public static final int a = 20;
	
	//abstract method
	public Integer add(Integer a, Integer b);
}

class AO implements IAO{
	//concrete method
	public Integer add(Integer a, Integer b){
		return 0;
	}
}