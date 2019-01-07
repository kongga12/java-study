package main.java.cal;

public class Calculator {
	private Adder adder;
	private Subtractor subtractor;
	
	public Calculator() {
		adder = new Adder();
		subtractor = new Subtractor();
	}
	
	public int addTwoNumber(int num1, int num2) {
		return adder.addTwoNumber(num1, num2);
	}
	
	public int subTwoNumber(int num1, int num2) {
		return subtractor.subTwoNumber(num1, num2);
	}
	
	public void showOperatingTimes() {
		System.out.println("덧셈 횟수 : " + adder.getCntAdd());
		System.out.println("뺄셈 횟수 : " + subtractor.getCntSub());
	}
}