package chapter6;

public class CardTest {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);	// 클래스 변수는 객체 생성없이 클래스이름.클래스변수로 사용 가능하다.
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";	//	인스턴스변수의 값을 변경
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		
		System.out.println("c1 은" + c1.kind + ", " + c1.number + "이며, 크기는 ("  
				+ c1.width + ", " + c1.height + ")");
		System.out.println("c2 은" + c2.kind + ", " + c2.number + "이며, 크기는 ("  
				+ c2.width + ", " + c2.height + ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1 은" + c1.kind + ", " + c1.number + "이며, 크기는 ("  
				+ c1.width + ", " + c1.height + ")");
		System.out.println("c2 은" + c2.kind + ", " + c2.number + "이며, 크기는 ("  
				+ c2.width + ", " + c2.height + ")");
		
	}
}
class Card {
	String kind;	//	인스턴스변수
	int number;		//	인스턴스변수
	static int width = 100;		//	클래스 변수
	static int height = 250;	//	클래스 변수
}
