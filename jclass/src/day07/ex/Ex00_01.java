package day07.ex;
/*
 	�ݺ��� ����]
 		
 		2g �߰� 5��
 		3g �߰� 4��
 		5g �߰� 3�� ���� ��� 
 		
 		15g ~ 25g �� ���Ը� �ٴ� ����� ������ ������ 
 		�� ����� ���� ��� ������� ������ִ� ���α׷��� �ۼ��ϼ���.
 */
public class Ex00_01 {
	public static void main(String[] args) {
		
		int count =0;
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= 4; j++) {
				for(int k = 0; k <= 3; k++){
					int n = k*5 + j*3 + i*2;
					if( n >= 15 && n <=25) {
						System.out.print( i + "�� " + j + "��" + k + "�� ");
						count++;
					}
				}
				
				System.out.println();
			}
		}
		System.out.println(count);
	}
}
