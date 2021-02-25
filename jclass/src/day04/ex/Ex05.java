package day04.ex;
/*
 	문제 5 ]
	컴퓨터와 가위바위보 게임을 할 프로그램을 제작하세요.
	
	컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생해서
		1 - 가위
		2 - 바위
		3 - 보
	로 가정하고
	사용자 역시 1 ~ 3 사이의 숫자를 입력하도록 한다.
	
	누가 이겼는지 확인하는 프로그램을 작성하세요.
	컴퓨터가 이기면 -1을 반환하도록하고
	사용자가 이기면 1을 반환하도록 하고
	비기면 0을 반환하도록한다.
	
	힌트 ]
			컴퓨터		가위		바위		보
		사용자	가위		0		-1		1
				바위		1		0		-1
				보		-1		1		0
 */
import java.util.*;
public class Ex05 {

	public static void main(String[] args) {
		int com = (int)(Math.random() * 3 + 1);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int user = sc.nextInt();
		String result = "";
		int sul = (user - com);
		if (sul == -1) { 
			result = ("컴퓨터가 이겼습니다 : " + -1);
		}
		else if (sul == 0) {
			result = ("비겼습니다 : " + 0);
		}
		else if (sul == 1) {
			result = ("사용자가 이겼습니다 : " + 1);
		}
		else 
			result = ("컴퓨터가 이겼습니다 : " + 2);
			
		System.out.println("사용자" + user + "컴퓨터" + com + "결과는" + result);
	}

}
