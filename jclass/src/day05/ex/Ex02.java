package day05.ex;
/*
 	문제2]
 		다섯자리의 숫자를 랜덤하게 발생시킨 후 
 		각 자리의 합을 구해주는 프로그램을 작성하세요.
 		단 , 반복문을 사용해서 처리하세요.
 		
 		힌트]
 			charAt() - 문자열의 특정위치의 문자를 꺼내주는 함수 
 			Integer.parseInt() - 숫자형식의 문자열을 정수로 변환시켜주는 함수 
 		
 		힌트2] 
 			정수를 10으로 나누면 한자리가 줄어든다.
 */
public class Ex02 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * (99999-10000+1)+10000);
		System.out.println(num);
		
		System.out.println(num%10);
		for(int i = 0; i < 4; i++) {	
				num /= 10;
				System.out.println(num%10);			
				
		}
		
	}

}
