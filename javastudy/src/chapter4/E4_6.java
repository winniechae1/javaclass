package chapter4;
/*
 	두 개의 주사위를 던졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력하세요.
 */
public class E4_6 {

	public static void main(String[] args) {
		
		int count = 0;
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if( i + j == 6) {
					System.out.print("합이 6이 되는 경우 " + i + "," + j);
					System.out.println();
				}
			}
		}
		
	}

}
