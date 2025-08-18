package edu.bit.training;

public class Login implements Cloneable {
	private boolean isAuthenticated;
	
	public Login(boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}
	
	public boolean isAuthenticated() {
		return this.isAuthenticated;
	}
	
	@Override
	public Object clone() {
		try {
			return super.clone();//for deep copy
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
