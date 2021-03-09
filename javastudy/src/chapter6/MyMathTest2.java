package chapter6;
/*
 	1. 클래스를 설계할 때, 멤버변수 중 모든 인스턴스에 공통적으로 사용하는 것에 static을 붙인다.
 	2. 클래스 변수는 인스턴스를 생성하지 않아도 사용할 수 있다.
 	3. 클래스 메서드는 인스턴스 변수를 사용할 수 없다.
 	4. 메서드 내에서 인스턴스 변수를 사용하지 않는다면 static 을 붙이는 것을 고려한다.
 	
 */
class MyMath2 {
	long a, b;
	
	long add() {
		return a + b;
	}
	long substract() {
		return a - b;
	}
	long multiply() {
		return a * b;
	}
	double divide() {
		return a / b;
	}
	static long add(long a, long b ) {
		return a + b;
	}
	static long substract(long a, long b ) {
		return a - b;
	}
	static long multiply(long a, long b ) {
		return a * b;
	}
	static double divide(double a, double b ) {
		return a / b;
	}
}

public class MyMathTest2 {
	public static void main(String[] args) {
		
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.substract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add());
		System.out.println(mm.substract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());

	}

}
