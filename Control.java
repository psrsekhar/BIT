class Control{
	public static void main(String[] args) {
		for(int i =0; i<= 100; i+=2){
			System.out.println("i : " + i);
		}
		
		int i = 0;
		while(i <= 100){
			System.out.println("i : " + i);
			i+=2;
		}
		
		i = 0;
		do{
			System.out.println("i : " + i);
			i+=2;
		}while(i <= 100)
	}
}