package day03;
/*
 	문제 5]
 		25 ~ 95 사이의 숫자 하나를 랜덤하게 발생 시킨 후  그 숫자와 
 		가장 가까운 10의 배수를 출력해주는 프로그램을 작성하세요.
 		발생한 숫자와 가까운 10의 배수를 모두 출력하세요. 
 		예]
 			27 >> 30이 가장 가까운 10의 배수 
 			32 >> 30이 가장 가까운 10의 배수 
 			
 */
public class Ex05 {

	public static void main(String[] args) {
		int lo = 25;
		int hi = 95;
		
		int num = (int)(Math.random() * (hi - lo + 1) + lo);
		System.out.println("25 ~ 95 사이의 랜덤 숫자 : " + num);
		
		System.out.println("발생한 숫자 : " + ((num % 10 >= 5) ? (((num/10) + 1) * 10 ) : ((num/10) * 10)));
		
	}

}
