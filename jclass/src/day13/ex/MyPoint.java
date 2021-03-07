package day13.ex;
/*
문제 2 ]
	1. 두 변수( int x, int y)를 기억하는 클래스 MyPoint를 작성하고
	2. 사용자가 이 클래스를 new 시킬수 있는 생성자 함수를 만들고
		1) 기본 생성자함수
		2) 두 수를 알려주면 그 수를 x, y에 기억하는 생성자 함수
		3) 두수를 배열로 알려주면
			그 수를 x, y에 기억하는 생성자 함수
	3. 함수 추가
		1) x 값을 셋팅해주는 함수
		2) y 값을 셋팅해주는 함수
		3) x, y를 동시에 셋팅해주는 함수
		4) x 값을 꺼내오는 함수
		5) y 값을 꺼내오는 함수
		6) x와 y 값을 출력해주는 함수(display)
*/
public class MyPoint {
	
	private int x, y;
	
	public MyPoint() {
		
	}
	public MyPoint(int a, int b) {
		x = a;
		y = b;
	}
	
	public MyPoint(int[] a) {
		/*
		x = a[0];
		y = a[1];
		*/
		this(a[0],a[1]);
	}
	public void setX(int a) {
		x = a;
	}
	public void setY(int b) {
		y = b;
	}
	public void setXY(int a, int b) {
//		this(a,b);
//		this()는 생성자함수에서만 사용할 수 있고 맨 첫문장으로 사용해야 한다.
		/*	이 방법도 가능
		setX(a);
		setY(b);
		*/
		x = a;
		y = b;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void display() {
		System.out.println("x : " + x + ", y :" + y);
	}
	
	
}
