package day05.ex;

import java.util.Scanner;

/*
	문제 6 ]
		두 정수를 입력받아서
		두 정수의 최소 공배수를 출력해주는 프로그램을 작성하세요.
		
		참고 ]
			최소공배수란 두 수로 나누어 떨어지는 최소 숫자를 이야기한다.
			
			2와 3의 최소 공배수는 6 이다.
			2와 7의 최소 공배수는 14이다.
			3과 7의 최소 공배수는 21이다.
 */
import java.util.*;
public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		int num1 = sc.nextInt();
		System.out.print("정수를 입력하세요 :");
		int num2 = sc.nextInt();
		int i = 1;
		int max=0;
		while(i < num1 && i < num2) {
			if(num1%i ==0 && num2%i ==0) {
				max = i;
			}
					i++;
			}
		int min = (num1*num2)/(max*max)*max; 
		System.out.println("최대공약수는" + max);
		System.out.println("최소공배수는" + min);
}

	}


