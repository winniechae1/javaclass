package day05_run.ex;
/*
문제 3 ]
	랜덤하게 두자리 숫자를 하나 발생시켜서
	사용자가 그 숫자를 알아맞추는 게임을 제작하세요.
	만들어진 숫자보다 큰 수를 입력한 경우는 
		- "큰수입니다."
	작은수를 입력한 경우는 
		- "작은 수 입니다."
	가 출력되도록 하고
	정답을 맞출때 까지 반복하도록 하세요.
*/
import java.util.*;
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random() * (99-10+1)+10);
	
		while(true) {
			System.out.print("두자리 숫자를 입력하세요 : ");
			int enter = sc.nextInt();
			
			if(enter>num) {
				System.out.println(num + "보다 큰 수입니다.");
			}else if (enter < num) {
				System.out.println(num + " 보다" + enter +" 은 작은 수입니다.");
			}else if (enter == num) {
				System.out.println("정답입니다.");
			}else
				System.out.println("잘못입력했습니다.");
			
			
		
		}
	}
}