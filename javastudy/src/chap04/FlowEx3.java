package chap04;

import java.util.*;
public class FlowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		
		System.out.print("숫자를 하나 입력하세요.>");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		input = Integer.parseInt(tmp);
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
	}

}
