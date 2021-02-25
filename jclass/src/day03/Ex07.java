package day03;
/*
 	문제 7]
	숫자 3개를 임의로 발생한 후 가장 큰 숫자만 선택해서 출력하는 프로그램을 작성하세요. 
	단, 3항 연산자를 사용해서 처리하세요. 
	(옵션 - 조건문으로 처리)
*/
 
public class Ex07 {

	public static void main(String[] args) {
		int num1 = (int)(Math.random() * (1000 - 1 + 1) * 1 );
		int num2 = (int)(Math.random() * (1000 - 1 + 1) * 1 );
		int num3 = (int)(Math.random() * (1000 - 1 + 1) * 1 );
		
		
		int result = ((num1 > num2 ) ? 
								((num1> num3) ? num1 : num3) : 
										((num2 > num3) ? num2 : num3 ));
		System.out.println("첫번째 수 : " + num1 + " 두번째 수 " + num2 + " 세번째 수 " + num3);
		System.out.println("가장 큰 수는 : " + result);
		
	}

}
