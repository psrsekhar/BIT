class Strings{
	public static void main(String[] args){	
		String firstName = "Samantha";
		String lastName = "Ruth Prabhu";		
		System.out.println("Concatenated string : " + firstName + lastName);
		
		System.out.println("Length: " + firstName.length());
		System.out.println(firstName.charAt(3));
		System.out.println(firstName.substring(2, 5));
				
		String name = new String("Samantha");
		if(firstName.equals(name)){
			System.out.println("Equal");
		}else{
			System.out.println("Not equal");
		}
		
		System.out.println("Lowercase: " + firstName.toLowerCase());
		System.out.println("Uppercase: " + firstName.toUpperCase());
		
		String sentence = " slkd lsd kl ldnlk  ds dl j jsld l jd  ";
		System.out.println("Trim :" + sentence.trim());
		
		System.out.println("Replaced string :" + sentence.replace('d', '$'));
	}
}

//Output: Samantha