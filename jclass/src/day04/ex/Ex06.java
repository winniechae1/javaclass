package day04.ex;
/*
 	문제 6 ]
	5자리 숫자를 랜덤하게 발생한 후
	각 자리 숫자의 합을 구하는 프로그램을 작성하세요.
	
	예 ]
		발생한 숫자 : 12345
		==>
			결과 : 1 + 2 + 3 + 4 + 5
 */
public class Ex06 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * (99999-10000 + 1) + 10000);
		int result = (num/10000 + (num%10000)/1000 + (num%1000)/100 + (num%100)/10 +(num%10));
		
		System.out.println("발생한 숫자:" + num + "결과" + result);
	}

}
