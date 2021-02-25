package day05_run.ex;
/*
문제 5 ]
	두개의 정수를 입력받아서
	두수의 최대 공약수를 출력해주는 프로그램을 제작하세요.
	
	참고 ]
		최대 공약수 ]
			두수를 나눌 수 있는 수중 제일 큰 수..
			
			예 ]
				6 과 8의 최대 공약수는 2이다.
				6 과 9의 최대공약수는 3이다.
*/
import java.util.*;
public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		int max = (num1 > num2) ? num1 : num2;
		int result;
		for(int i = max; true; i--) {
			if (num1%i==0 && num2%i==0) {
				result = i;
				break;
			}
		}
		System.out.println("두 수 " + num1 + "와" + num2 + "의 최대공약수는" + result);

	}

}
