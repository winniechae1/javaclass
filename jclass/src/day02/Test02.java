package day02;
/*
 	문제2]
	사각형의 가로와 세로의 길이를 정수로 입력받아서 
	넓이를 출력해주는 프로그램을 작성하세요.
 */

import java.util.*;

public class Test02 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("가로의 길이 : ");
		int hr = sc.nextInt();
		System.out.print("세로의 길이 : ");
		int vr = sc.nextInt();
		
		int area = hr * vr; 
		
		System.out.println("가로의 길이는 " + hr + "세로의 길이" + vr + "인 사각형의 넓이는" + area + "입니다." );
		

	}

}
