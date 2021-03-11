package chap07;
/*
 	instanceof 연산자 : 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 사용하는 것.
 	주로 조건문에 사용되며 참조변수 instanceof 클래스명(타입) 
 	연산의 결과는 true 또는 false 값 중의 하나를 반환한다.
 	[7-17]
 */
public class InstanceofTest {

	public static void main(String[] args) {
		FireEngine3 fe3 = new FireEngine3();
		
		if(fe3 instanceof FireEngine3) {
			System.out.println("This is a FireEngine3 instance");
		}
		if(fe3 instanceof Car3) {
			System.out.println("This is a Car3 instance");
		}
		if(fe3 instanceof Object) {
			System.out.println("This is an Object instance");
		}
		System.out.println(fe3.getClass().getName());
	}
}

class Car3 {
	
}
class FireEngine3 extends Car3 {
	
}