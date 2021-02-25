package day04.ex;
/*
 	  
문제 4 ]
	전기요금을 계산하는 프로그램을 작성하세요.
	
	전기요금은 용도별로 
				코드		기본요금	사용요금
		가정용	1		3800	245
		산업용	2		2400	157
		교육용	3		2900	169
		상업용	4		3200	174
		
		전기요금 계산식 : 기본요금 + 사용량 * 사용요금
		
	용도 코드와 사용량을 입력받아서 전기요금을 계산해주는 프로그램을 작성하세요.
	
 */
import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("용도 코드를 입력하세요 : ");
		int code = sc.nextInt();
		System.out.print("사용량을 입력하세요 : ");
		int use = sc.nextInt();
		int fare;
		switch (code) {
		case 1:
			fare = 3800 + (use * 245);
			break;
		case 2:
			fare = 2400 + (use * 157);
			break;
		case 3:
			fare = 2900 + (use * 169);
			break;
		default:
			fare = 3200 + (use * 174);
			break;
		}
		System.out.println("코드번호" + code + " 사용량" + use + "인 요금은" + fare + "입니다.");

	}

}
