package day14;

public class Father extends Grand{
	int no = 100;
	public Father() {
		System.out.println("����� Father Ŭ����");
	}
	// Grand Ŭ������ abc()�� �������̵�(Overriding, �Լ��� ������)
	public void abc() {
		System.out.println("����� �������̵� �� Father.abc()");
	}
}
