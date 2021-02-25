package day02;

/*
 	반지름을 입력받아서 원의 넓이를 출력해주는 프로그램을 작성하세요.
 */

import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		
		int rad = sc.nextInt();
		// 이 경우도 숫자가 아닌 다른 문자 또는 실수 형태를 입력하면  에러가 난다.
		Double area = rad * rad * 3.14;
		
		System.out.println("반지름이 " + rad + " 인 원의 넓이는 : " + area + "입니다.");
		
	}
}
