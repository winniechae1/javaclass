package day15;

public class Test04 {

	public Test04() {
		System.out.println("����� Test04 ������");
	}
	
	public void abc() {
		System.out.println("����� Test04Ŭ������ abc() �Լ�");
	}
	public static void main(String[] args) {
		Object o = new Test04();
//		o.abc();	-> Object Ŭ�������� abc() �Լ��� �������� �ʱ� ������ �̷��� ȣ���ϴ� ���� �ȵȴ�.
	}
	
}
