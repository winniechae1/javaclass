package chap07;
/*
 	[7-12]	생성자를 이용한 final 멤버변수의 초기화
 */

class Card1 {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card1(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Card1(){
		this("HEART" , 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class FinalCardTest {
	public static void main(String[] args) {
		Card1 c1 = new Card1("HEART", 10);
//		c1.NUMBER = 5;	// final 변수이기 때문이다.
		System.out.println(c1.KIND);
		System.out.println(c1.NUMBER);
		System.out.println(c1);
	}
}
