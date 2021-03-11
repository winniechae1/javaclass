package chap07;
//	[7-20]
public class BindingTest3 {

	public static void main(String[] args) {
		Parentbt3 pb3 = new Childbt3();
		Childbt3 cb3 = new Childbt3();
		
		System.out.println("pb3.x = " + pb3.x);
		pb3.method();
		System.out.println();
		System.out.println("cb3.x = " + cb3.x);
		cb3.method();
	}
}

class Parentbt3 {
	int x = 100;
	
	void method() {
		System.out.println("Parentbt3 Method");
	}
}

class Childbt3 extends Parentbt3 {
	int x = 200;
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("super.x = " + super.x);
		System.out.println("this.x = " + this.x);
		
	}
}