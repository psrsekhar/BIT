package edu.bit.training.abstraction;

public class ArithematicOperationsImpl implements ArithematicOperations {

	@Override
	public Integer add(Integer a, Integer b) {
		if(validate(a, b)) {
			return a + b;
		}else {
			System.out.println("Validation failed....");
		}
		return null;
	}

	@Override
	public Integer sub(Integer a, Integer b) {
		if(validate(a, b)) {
			return a - b;
		}else {
			System.out.println("Validation failed....");
		}
		return null;
	}

	@Override
	public Integer mul(Integer a, Integer b) {
		if(validate(a, b)) {
			return a * b;
		}else {
			System.out.println("Validation failed....");
		}
		return null;
	}

	@Override
	public Integer div(Integer a, Integer b) {
		if(validate(a, b)) {
			return a / b;
		}else {
			System.out.println("Validation failed....");
		}
		return null;
	}

	private Boolean validate(Integer a, Integer b) {
		Boolean isValid = false;
		if (a > 50 && b > 50 && (a % 2 == 0) && (b % 2 == 0)) {
			isValid = true;
		}
		return isValid;
	}

}
