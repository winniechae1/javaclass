package chap07;
/*
 	[7-5] 
 	super 는 자식클래스에서 부모클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수이다.
 	상속받은 멤버와 자신의 클래스에 정의된 멤버의 이름이 같을 때는 super를 사용해서 구별할 수 있다.
 */
public class SuperTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent {	//	부모클래스
	int x = 10;
}

class Child extends Parent {
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}