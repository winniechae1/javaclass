package chapter4;
// ������ 2x + 4y = 10 �� ��� �ظ� ���Ͻÿ� 
// x �� y �� �����̰� ������ ������  0<= x <= 10 , 0 <= y <= 10
public class E4_8 {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				if( 2 * i + 4 * j == 10 ) {
					System.out.print("2x + 4y = 10 �� ��� �� (" + i + "," + j + ")");
					System.out.println();
				}
				else if(2 * j + 4 * i == 10) {
					System.out.print("2x + 4y = 10 �� ��� �� (" + i + "," + j + ")");
					System.out.println();
				}
			}
		}

	}

}
