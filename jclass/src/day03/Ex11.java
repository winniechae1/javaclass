package day03;
/*
 	문제11]
	3자리 숫자를 입력받아서 이 숫자에서 가장 가까운 100의 배수를 만들기 위해서는 
	얼마가 필요한지를 계산해서 출력해주는 프로그램을 작성하세요. 

	예]
		241    - 200 이 가까우므로 41을 빼야한다.
 */
import java.util.*;
public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3자리 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int sul = num % 100;
		String result = ((sul < 50) ? ( (num-sul)  + "이 가까우므로" + sul + " 를 빼야한다.")  
								: ((num-sul+100) + "이 가까우므로 " + (100-sul) + " 를 더해야한다.") );
		 
		System.out.println("입력한 숫자 " + num + "은 " + result );

	}

}
