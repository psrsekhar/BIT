interface DiscountStrategy{
	//abstract method
	public Double getFinalAmount(Double amount, String discountType);
}

class DiscountStrategyImpl implements DiscountStrategy{
	//Concrete methods
	//Method hiding or partial abstraction
	private void getDBConnection(){
		System.out.println("connecting to database");
	}
	
	@Override
	public Double getFinalAmount(Double amount, String discountType){
		getDBConnection();
		if (discountType.equals("FS")){
			return amount - (amount * 0.05);
		}else if (discountType.equals("GIS")){
			return amount - (amount * 0.1);
		}else if (discountType.equals("RS")){
			return amount - (amount * 0.2);
		}else{
			return amount;
		}
	}
}

class Amazon{
	public static void main(String[] a){
		//parent reference child object -> Abstraction
		DiscountStrategy ds = new DiscountStrategyImpl();
		System.out.println(ds.getFinalAmount(1500.0, "RS"));
		ds.getDBConnection();
	}
}