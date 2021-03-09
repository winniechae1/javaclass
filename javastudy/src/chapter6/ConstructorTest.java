package chapter6;
/*
 	생성자
 	Card c = new Card();
 	1.	연산자 new에 의해서 메모리(heap)에 Card 클래스의 인스턴스가 생성된다.
 	2.	생성자 Card()가 호출되어 수행한다.
 	3.	연산자 new의 결과로, 생성된 Card 인스턴스의 주소가 반환되어 참조변수 c에 저장된다.
 */

class Data1 {
	int value;
}
class Data2 {
	int value;
	Data2(int x){	//	매개변수가 있는 생성자
		value = x;
	}
}
public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
//		Data2 d2 = new Data2();		// 컴파일러가 자동으로 기본 생성자를 추가해주는 경우는
									//	'클래스 내에 생성자가 하나도 없을 때' 
		Data2 d2 = new Data2(10);

	}

}
