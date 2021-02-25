package day04.ex;
/*
 	10 ~ 49 까지의 수 중 정수 하나를 입력받아서 
 	
	10 ~ 19 : 총무부
	20 ~ 29 : 영업부
	30 ~ 39 : 회계부
	40 ~ 49 : 개발부
	로 출력해주는 프로그램을 작성하세요. 
	
	if ~ else if 구문 
	
	switch ~ case 구문 
	
	두가지 모두 처리하세요.
 */
import java.util.*;
public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		String dname = "";
		
		int first = num / 10;
		/*
		if (first == 1) {
			dname = "총무부";
		}
		else if (first == 2) {
			dname = "영업부";
		}
		else if (first == 3) {
			dname = "회계부";
		}
		else {
			dname = "개발부";
		}
		System.out.println("입력한 정수 " + num + " 은 " + dname + " 에 소속된 부서입니다.");
		*/
		switch (first) {
		case 1:
			dname = "총무부";
			break;
		case 2:
			dname = "영업부";
			break;
		case 3:
			dname = "회계부";
			break;
		default:
			dname = "개발부";
		}
		System.out.println("입력한 정수 " + num + " 은 " + dname + " 에 소속된 부서입니다.");
	}
	}


