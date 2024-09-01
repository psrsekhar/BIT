package edu.bit.training.abstraction;

public class Caluclator {
	public static void main(String[] a) {
		ArithematicOperations aOp = new ArithematicOperationsImpl();
		aOp.add(45,67);
		aOp.sub(95,23);
		aOp.mul(76,68);
	}
}
