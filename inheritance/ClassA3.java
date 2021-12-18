package inheritance;

public class ClassA3 extends ClassA{
	public void method5() {
		System.out.println("m5");
	}
	public void methodm6() {
		
		System.out.println("m6");
	}

	public static void main(String[] args) {
		ClassA3 a3=new ClassA3();
		a3.method5();
		a3.methodm6();
		a3.method1();
	}

}

