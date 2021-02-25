package day05_run;
/*
단을 입력받아서
해당 단의 구구단을 출력해주는 프로그램을 작성하세요.
-----------------------------------------
단을 출력하면 다시 단을 입력받도록 하고
0을 입력하면 프로그램 종료되도록 
프로그램을 작성하세요.
*/
import java.util.*;
public class T04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("단을 입력하세요: ");
			int dan = sc.nextInt();
			if(dan == 0) {
				System.out.println("프로그램이 종료됐습니다.");
				break;
			}
			System.out.println("****" + dan + "단 ****");
			for(int gop=1; gop<10; gop++) {
				System.out.println(dan + " x " + gop + " = " + (dan*gop));
			}
		}
		}
	}

