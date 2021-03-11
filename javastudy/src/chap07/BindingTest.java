package chap07;
// [7-18]
public class BindingTest {
	public static void main(String[] args) {
		Parentbind p = new Childbind();
		Childbind c = new Childbind();
		
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
	}
}
class Parentbind {
	int x = 100;
	
	void method() {
		System.out.println("Parentbind Method");
	}
}

class Childbind extends Parentbind {
	int x = 200;
	
	void method() {
		System.out.println("Childbind Method");
	}
}
