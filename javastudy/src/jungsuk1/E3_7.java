package jungsuk1;
/*
 	ȭ���� ������ ��ȯ�ϴ� �ڵ��̴� 
 	������ 5/9 * (F-32) ��� �Ҷ� 
 	��ȯ ������� �Ҽ��� ��°�ڸ����� �ݿø��ؾ��Ѵ�.
 */
public class E3_7 {
	public static void main(String[] args) {
		
		int  f = 100;
		float c = (int)((f-32)*100*5/9f + 0.5) / 100f;
				
		System.out.println("ȭ���µ� : " + f);
		System.out.println("�����µ� : " + c);
	}
}
