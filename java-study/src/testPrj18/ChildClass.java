package testPrj18;

public class ChildClass extends ParentClass {

	public ChildClass() {
		System.out.println("ChildClass constructor");
	}

	public void ChildFunc(){
		System.out.println("childFunc()");
	}
	
	@Override
	public void twoFunc(){
		System.out.println("override two Func()");
	}
}
