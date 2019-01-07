package main.java.cal;

public class Subtractor {

	private int cntSub;
	
	Subtractor() {
		cntSub = 0;
	}
	
	public int subTwoNumber(int num1, int num2) {
		cntSub++;
		return num1 - num2;
	}

	public int getCntSub() {
		
		return cntSub;
	}

}
