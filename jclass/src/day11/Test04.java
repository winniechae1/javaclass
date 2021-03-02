package day11;

public class Test04 {
	int code = 0; // 전역변수
	
	public Test04() {
		System.out.println("여기는 Test04 클래스");
		Test01 t;	//	Test01 클래스 타입의 변수 선언 	이때 Heap Type은 Test01
		t = new Test01();	// 변수를 초기화	--> Object
		
		double result = t.calc("12*2");
		System.out.println("12*2 : " + result);
		
		System.out.println("Test01.num : " );
		
		Test01 t1 = new Test01();
//		System.out.println("t1.num : " + t1.num);
	}	
	public void abc() {
		System.out.println(code);
		if(true) {
			System.out.println(code);
		}
	}
	
	public static void main(String[] args) {
		new Test04();
//		System.out.println(code); 이유 : static 이라는 속성때문에 
	}

}
