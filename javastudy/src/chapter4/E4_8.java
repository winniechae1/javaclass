package chapter4;
// 방정식 2x + 4y = 10 의 모든 해를 구하시오 
// x 와 y 는 정수이고 각각의 범위는  0<= x <= 10 , 0 <= y <= 10
public class E4_8 {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				if( 2 * i + 4 * j == 10 ) {
					System.out.print("2x + 4y = 10 의 모든 해 (" + i + "," + j + ")");
					System.out.println();
				}
				else if(2 * j + 4 * i == 10) {
					System.out.print("2x + 4y = 10 의 모든 해 (" + i + "," + j + ")");
					System.out.println();
				}
			}
		}

	}

}
