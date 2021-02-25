package day04;
/*
  	구구단 5단을 출력하세요.
 
public class Test03 {

	public static void main(String[] args) {
		int i = 5;
		for(int j=0; j < 9; j++) {
			System.out.println( i + " x " + (j+1) + " = " + (i * (j+1)));
		}

	}

}
*/
public class Test03{
	
	public static void main(String[] args) {
		
		for (int i=2; i<10; i++) {
			for (int j=0; j<9; j++) {
				System.out.println( i + " x " + (j+1) + " = " + (i * (j+1)));
			}
		}
	}
}