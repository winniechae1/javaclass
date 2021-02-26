package chapter4;
/*
 	변수 num 의 값이 12345 면 1 + 2 + 3 + 4 + 5 의 결과를 출력하세요.
 */
public class E4_10 {

	public static void main(String[] args) {
		
		int num = 12345;
		int sum = 0;
		int tmp = num;
		for(int i = 0; i < 5; i++) {
			sum = sum + (tmp%10);
			tmp = tmp / 10 ;

		}
		System.out.println("sum = " + sum);

	}

}
