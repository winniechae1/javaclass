package day03;
/*
 	문제 1]
 		3자리 숫자를 랜덤하게 발생시켜서 
 		백자리 미만은 버린 숫자를 만들어서 출력하세요.
 */
public class Ex01 {

	public static void main(String[] args) {
		int lo = 100;
		int hi = 999;
		
		int num = (int)(Math.random() * ( hi - lo + 1) + lo);
		System.out.println("3자리의 랜덤 숫자 : " + num);
		System.out.println("3자리의 랜덤 버림 숫자 : " + (num/100) * 100);
		

	}

}
