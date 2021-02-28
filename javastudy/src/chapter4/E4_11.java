package chapter4;
/*
 	피보나치 수열을 이용해서 1과 1부터 시작하는 피보나치 수열의 10번째 수는 무엇인가?
 */
public class E4_11 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1 + "," + num2 );
		
		for(int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			num1 = num2; 
			num2 = num3;
			System.out.print("," + num3);
		}
	
		
	}

}
