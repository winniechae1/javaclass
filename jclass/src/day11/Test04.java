package day11;

public class Test04 {
	int code = 0; // ��������
	
	public Test04() {
		System.out.println("����� Test04 Ŭ����");
		Test01 t;	//	Test01 Ŭ���� Ÿ���� ���� ���� 	�̶� Heap Type�� Test01
		t = new Test01();	// ������ �ʱ�ȭ	--> Object
		
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
//		System.out.println(code); ���� : static �̶�� �Ӽ������� 
	}

}
