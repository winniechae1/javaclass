package day03;
/*
	���� 7]
		���� 3���� ���Ƿ� �߻��� �� ���� ū ���ڸ� �����ؼ� ����ϴ� ���α׷��� �ۼ��ϼ���. 
		��, 3�� �����ڸ� ����ؼ� ó���ϼ���. 
		(�ɼ� - ���ǹ����� ó��)
	
	* ������ Ǯ��
*/
public class Ex07_01 {

	public static void main(String[] args) {
		// ������ ������ 3�� �߻����Ѽ� ������ ���
		int no1 = (int)(Math.random() * 45 + 1);
		int no2 = (int)(Math.random() * 45 + 1);
		int no3 = (int)(Math.random() * 45 + 1);
		
		// ���ϱ�
		/*
		 	no1 > no2 ���
		 		no1 �� no3 ���� ū ��� 
		 		no1 �� no3 ���� ���� ��� 
		 */
		int max = ((no1 > no2) ? (no1 > no3 ? no1 : no3) : 
										(no2 > no3 ? no2 : no3));
		
		System.out.println("�Էµ� �� ����" + no1 + ", " + no2 + ", " + no3 + 
									" �� ���� ū ���� " + max + " �Դϴ�.");
	}

}
