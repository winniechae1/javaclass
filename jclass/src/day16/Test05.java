package day16;

import java.util.*;
public class Test05 {

	public Test05() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		String str = sc.nextLine();
		
		int no = 0;
//		no = Integer.parseInt(str);
		
		try { 
			no = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			//	예외 정보 출력 방법
			//	1. 변수 출력 방법
//			System.out.println(e);	//	예외 정보만 출력
			
			//	2. 예외 정보와 위치까지 출력하는 방법
			e.printStackTrace();
			no = -999;
		}
		
		System.out.println("no : " + no);
		}

	public static void main(String[] args) {
		new Test05();

	}

}
