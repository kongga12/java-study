package main.java.cal;

public class Adder {
	private int cntAdd;
	
	Adder() {
		cntAdd = 0;
	}
	
	public int addTwoNumber(int num1, int num2) {
		// TODO Auto-generated method stub
		cntAdd++;
		return num1+num2;
	}

	public int getCntAdd() {
		// TODO Auto-generated method stub
		return cntAdd;
	}

}
