package chapter4;
/*
 	�� ���� �ֻ����� ��������, ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϼ���.
 */
public class E4_6 {

	public static void main(String[] args) {
		
		int count = 0;
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if( i + j == 6) {
					System.out.print("���� 6�� �Ǵ� ��� " + i + "," + j);
					System.out.println();
				}
			}
		}
		
	}

}
