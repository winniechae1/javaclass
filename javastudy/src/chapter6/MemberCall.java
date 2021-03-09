package chapter6;

public class MemberCall {
	int iv = 10;	//	�ν��Ͻ� ����
	static int cv = 20;		//	Ŭ���� ����
	
	int iv2 = cv;
//	static int cv2 = iv;	//	Ŭ���� ������ �ν��Ͻ� ������ ����� �� ����.
	static int cv2 = new MemberCall().iv;	//	��ü�� �����ؾ� ��� ����.
	
	static void staticMethod() {
		System.out.println(cv);
//		System.out.println(iv);	//	Ŭ���� �޼��忡�� �ν��Ͻ� ���� ��� �Ұ�
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	void instanceMethod() {
		System.out.println(cv);
		System.out.println(iv);
	}
	static void staticMethod2() {
		staticMethod();
//		instanceMethod();	//	Ŭ���� �޼��忡���� �ν��Ͻ��޼��� ȣ�� �Ұ�.
		MemberCall c = new MemberCall();
		c.instanceMethod(); 	//	�ν��Ͻ� ���� �� ȣ�� ����.
	}
	
	void instanceMethod2() {
		staticMethod();
		instanceMethod();
	}
}
