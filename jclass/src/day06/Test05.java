package day06;
/*
 	10���� ���ڸ� ����� �޸𸮸� ����� 
 	�޸𸮿� 'A' ~ 'J' ���� ���ʷ� ����� �� ����ϼ���.
 */
public class Test05 {

	public static void main(String[] args) {
//			�ּҸ� ����� ������ �غ�
		char[] ch ;
		
//		Heap�� �޸� �����̳� Ȯ���ϰ� 
		
		ch = new char[10];
		
		// �ݺ��ؼ� �� �濡 ������ ä��� 
		for(int i= 0; i < 10; i++) {
			ch[i] = (char)('A' + i);
		}
		// �ϳ��� ������ ����Ѵ�.
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " , ");
		}
		System.out.println();
		
//		���� for ��� (for each ���)
		for(char c : ch) {
			// �� �ݺ����� �迭(ch)�� ��� ������ �ϳ��� ������ 
			// ���� c�� ���������� ���Խ�Ų��. 
			// ��������� ��� �����͸� ���������� ������ ó���ϰ� ����ȴ�.
			System.out.print(c + " , ");
			}
	}

}
