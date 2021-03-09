package chapter6;

public class MemberCall {
	int iv = 10;	//	인스턴스 변수
	static int cv = 20;		//	클래스 변수
	
	int iv2 = cv;
//	static int cv2 = iv;	//	클래스 변수는 인스턴스 변수를 사용할 수 없음.
	static int cv2 = new MemberCall().iv;	//	객체를 생성해야 사용 가능.
	
	static void staticMethod() {
		System.out.println(cv);
//		System.out.println(iv);	//	클래스 메서드에서 인스턴스 변수 사용 불가
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	void instanceMethod() {
		System.out.println(cv);
		System.out.println(iv);
	}
	static void staticMethod2() {
		staticMethod();
//		instanceMethod();	//	클래스 메서드에서는 인스턴스메서드 호출 불가.
		MemberCall c = new MemberCall();
		c.instanceMethod(); 	//	인스턴스 생성 후 호출 가능.
	}
	
	void instanceMethod2() {
		staticMethod();
		instanceMethod();
	}
}
