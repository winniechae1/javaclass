package day16;

public class Test01 implements MyInterface01{
	
	public Test01() {
		MyInterface01 i1 = this;
		MyInterface01 i2 = new Test01();
		
//		i1.toPrint();
	}
	/*
	 	�������̽��� ��ӹ޴� ���� Ư���� "�����Ѵ�" ��� ǥ���ϰ� 
	 	�ݵ�� �������̽� �Ҽ��� �Լ��� �������̵� �ؾ��Ѵ�.
	 */
	public void toPrint() {
		//	�������̽� �Ҽ��� �Լ��� �ڵ������� public abstract �� �ٱ� ������ 
		//	�������̵� ��Ģ 2�� : ���������ڰ� ���ų� ���� �������� 
		System.out.println("����� �������̽� ���� Ŭ����");
	}
	public static void main(String[] args) {
		new Test01();
	}	
}	
