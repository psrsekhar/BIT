package edu.bit.training;

public class Games implements Cloneable{
	private String name;
	private int score;
	private Login login;//reference -> Composition or Aggregation -> has-a relationship

	@Override
	public Object clone() {
		try {
			Games copy = (Games)super.clone();
			copy.login = (Login)this.login.clone();//deep copy of reference
			return copy;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	//setters and getters of instance variables
}
	/**
	@Override
	public String toString() {
		return "Name:\t" + this.name + "\t Score:\t" + this.score;
	}

	
	@Override
	public int hashCode() {
		int hash = 7;// non-zero base
		hash = 31 * hash + score;// 266
		hash = 31 * hash + (this.name == null ? 0 : this.name.hashCode());//
		hash = 31 * hash + (this.score == null ? 0 : this.score.hashCode());
		return hash;
	}

	@Override
	public boolean equals(Object o) {
		// self check
		if (this == o) {
			return true;
		}
		// null Check
		if (o == null) {
			return false;
		}

		// class check
		if (this.getClass() == o.getClass()) {
			// custom value/state check
			Games parameter = (Games) o;
			if ((this.name.hashCode() == parameter.name.hashCode())
					&& (this.score.hashCode() == parameter.score.hashCode())) {
				return true;
			}
		}
		return false;
	}
	
}*/
