package chapter6;
/*
 	������
 	Card c = new Card();
 	1.	������ new�� ���ؼ� �޸�(heap)�� Card Ŭ������ �ν��Ͻ��� �����ȴ�.
 	2.	������ Card()�� ȣ��Ǿ� �����Ѵ�.
 	3.	������ new�� �����, ������ Card �ν��Ͻ��� �ּҰ� ��ȯ�Ǿ� �������� c�� ����ȴ�.
 */

class Data1 {
	int value;
}
class Data2 {
	int value;
	Data2(int x){	//	�Ű������� �ִ� ������
		value = x;
	}
}
public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
//		Data2 d2 = new Data2();		// �����Ϸ��� �ڵ����� �⺻ �����ڸ� �߰����ִ� ����
									//	'Ŭ���� ���� �����ڰ� �ϳ��� ���� ��' 
		Data2 d2 = new Data2(10);

	}

}
