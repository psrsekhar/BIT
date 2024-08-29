class SBuilder{
	public static void main(String[] args){	
		StringBuilder sb = new StringBuilder("Saran");
		System.out.println("Capacity: " + sb.capacity());
		
		sb.append("BIT");		
		System.out.println("Name: " + sb.toString());
		
		sb.insert(4, '$');
		System.out.println("After insert(): " + sb);
		
		sb.replace(5, 7, "and");
		System.out.println("After replace(): " + sb);
		
		sb.delete(5, 7);
		System.out.println("After delete(): " + sb);
				
		sb.reverse();
		System.out.println("After reverse(): " + sb);
		
		sb.setCharAt(2, '$');
		System.out.println("After setCharAt(): " + sb);
		
		sb.length();
		
		sb.deleteCharAt(2);
		System.out.println("After deleteCharAt(): " + sb);
	}
}