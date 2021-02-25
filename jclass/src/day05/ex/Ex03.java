package day05.ex;
/*
 	문제3]
 		랜덤하게 두자리 숫자를 하나 발생시켜서 
 		사용자가 그 숫자를 알아맞추는 게임을 제작하세요.
 		만들어진 숫자보다 큰 수를 입력한 경우는 "큰수입니다."
 		작은수를 입력한 경우는 "작은 수 입니다." 가 출력되도록 하고 
 		정답을 맞출때까지 반복하도록 하세요.
 */
import java.util.*;
public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int enter = sc.nextInt();
			String result = "";	
			int num = (int)(Math.random() * (99-10+1)+10);
			
			if(enter == num) {
				break;
			}
				if(enter > num) {
					result = "큰 수입니다.";
				}
				else 
					result = "작은 수입니다.";
			
			System.out.println("랜덤숫자는" + num + "입력한 숫자는" + enter + "결과는" + result);
		}
		
	}
}
