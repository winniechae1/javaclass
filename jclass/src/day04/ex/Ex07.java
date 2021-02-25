package day04.ex;
/*
 	문제 7 ]
	랜덤하게 두자리 숫자를 만들고
	사용자가 예측한 숫자를 입력해서
	입력한 수가 발생된 수보다 큰지 작은지 아니면 같은지를 
	출력해주는 프로그램을 작성하세요.
 */
import java.util.*;
public class Ex07 {

	public static void main(String[] args) {
		int rnum = (int)(Math.random() * (99 - 10 + 1) + 10);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자가 예측한 숫자 : ");
		int pnum = sc.nextInt();
		
		String result = "";
		
		if(rnum > pnum) {
			result = (rnum + "이" + pnum + " 보다 크다.");
		}
		else if (rnum < pnum) {
			result = (rnum + "이" + pnum + " 보다 작다.");
		}
		else
			result = (rnum + "이" + pnum + " 과 같다.");
		
		System.out.println("랜덤수 " + rnum + " 은 " + pnum + " 과 비교해서" + result);
	}

}
