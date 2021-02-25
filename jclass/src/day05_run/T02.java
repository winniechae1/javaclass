package day05_run;

/*
	10 ~ 49 까지의 수중 정수 하나를 입력받아서
		
		10 ~ 19 : 총무부
		20 ~ 29 : 영업부
		30 ~ 39 : 회계부
		40 ~ 49 : 개발부
	
	로 계속 반복해서 출력해주는 프로그램을 작성하세요.
	
	99를 입력하는 종료되도록 하세요.
 */
import java.util.*;
public class T02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("부서번호를 입력하세요 : ");
		int dno = sc.nextInt();
		
		String dname = "";
		if (dno == 99) {
			System.out.println(dno + "해당 부서번호가 없습니다.");
			break;
		}
		switch(dno/10) {
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
			break;
		}
		
		System.out.println(dno + "는" + dname + "입니다.");
		}
		
		
	}
}
