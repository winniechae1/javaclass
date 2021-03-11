package chap07;
// [7-19]
public class BindingTest2 {
	public static void main(String[] args) {
		Parentb2 pb2 = new Childb2();
		Childb2 cb2 = new Childb2();
		
		System.out.println("pb2.x = " + pb2.x);
		pb2.method();
		System.out.println("cb2.x = " + cb2.x);
		cb2.method();
	}
}

class Parentb2 {
	int x = 100;
	void method() {
		System.out.println("Parentb2 Method");
	}
}

class Childb2 extends Parentb2 {
	
}