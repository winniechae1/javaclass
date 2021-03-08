package day15;

public class Test09 {

	public Test09() {
		int no = (int)(Math.random() * 10 + 1);
		
		Father01 f1 = null;
		//	¦���϶��� f1�� �׸�Ŭ������ �������ְ� 
		//	Ȧ���϶��� f1�� ����Ŭ������ �������ش�.
		
		if(no % 2 == 0) {
			f1 = new Nemo();
		} else {
			f1 = new Semo();
		}
		System.out.println("no : " + no);
		//	����غ���.
		f1.display();
	}

	public static void main(String[] args) {
		new Test09();

	}

}

//	���õ� Ŭ������ ��ǥ�ϴ� ����Ŭ���������� ����ϱ�� ����.
abstract class Father01 {
	abstract void display();
}

//	���� Father01 Ŭ������ ��ӹ��� Ŭ������ ������.
class Semo extends Father01 {
	protected void display() {
		//	�������̵� ��Ģ 1�� : �Լ��� ������ �����Ѵ�.
		System.out.println("�� Ŭ������ ���� Ŭ����");
	}
}

class Nemo extends Father01 {
	public void display() {
		//	�������̵� ��Ģ 2�� : ���������ڴ� ���ų� ���� �������� 
		System.out.println("�� Ŭ������ �׸� Ŭ����");
	}
}