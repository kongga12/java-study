package main.java;

class Number {
	int num = 0; 

	public void addNum(int n){
		num += n;
	}
	
	public int getNum(){
		return num;
	}
}

public class PassInstance {

	public static void main(String[] args) {
		Number nInst = new Number();
		
		System.out.println("메서드 호출 전 : " + nInst.getNum());
		
		simpleMethod(nInst);
		System.out.println("메소드 호출 후 : "+nInst.getNum());
		
	}

	private static void simpleMethod(Number numb) {
		numb.addNum(12);
		
	}

}
