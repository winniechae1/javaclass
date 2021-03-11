package chap07;
/*
 	참조변수의 형변환 
 	자식타입을 조상타입으로 형변환 : Up - casting (형변환 생략가능)
 	부모타입을 자식타입으로 형변환 : Down - casting (형변환 생략불가)
 	
 	형변환은 참조변수의 타입을 변환하는 것이지 인스턴스를 변환하는 것은 아니다. 
 	따라서 참조변수의 형변환은 인스턴스에 아무런 영향을 미치지 않는다.
 	[7-15]
 */
public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		fe2 = (FireEngine)car;
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}