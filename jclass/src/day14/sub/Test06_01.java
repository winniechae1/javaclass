package day14.sub;

public class Test06_01 {

	public Test06_01() {
//		Sub01 s1 = new Sub01();		// ��Ű���� �ٸ��� ������ �ƴϵȴ�.
		Sub02 s2 = new Sub02();
//		s2.no1 = 100; 	//	no1�� ���������ڰ� private�̱� ������ �ȵȴ�.
		s2.no2 = 200;	//	no2�� ���������ڰ� ������ ���(������ ���� ��Ű�� + Ŭ���� ������ ����)
	}
	public static void main(String[] args) {
		new Test06_01();
	}

}
