package day03;

/*
	���� 7]
		���� 3���� ���Ƿ� �߻��� �� ���� ū ���ڸ� �����ؼ� ����ϴ� ���α׷��� �ۼ��ϼ���. 
		��, 3�� �����ڸ� ����ؼ� ó���ϼ���. 
		(�ɼ� - ���ǹ����� ó��)

	* ������ Ǯ�� if ������ ó�� 
*/
public class Ex07_02 {

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
	int max = 0;
	
	if(no1 > no2) {
		// ����] ���ǹ� ���� ��ø�ؼ� ����� �� �ִ�.
		if (no1 > no3) {
			max = no1;
		}
		else {
			max = no3;
		}
	}
	else { // no2��  no1���� ū ����̴�. 
		   // ���� ū ���� no2�� no3�� ���ϸ� �ذ�ȴ�.
		if(no2 > no3) {
			max = no2;
		}
		else {	// no3 �� no2 ���� ū ����̴�. 
				// no2�� no1���� ũ�Ƿ� no3�� ���� ū ���̴�.
			max = no3;
		}
	}
	System.out.println("�Էµ� �� ����" + no1 + ", " + no2 + ", " + no3 + 
								" �� ���� ū ���� " + max + " �Դϴ�.");
}

}