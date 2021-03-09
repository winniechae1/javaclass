package day16;

import java.util.*;
public class Test08 {

	public Test08() {
		int no = 0;
		try {
			no = addNum();
		} catch(NumberFormatException e) {
			System.out.println("숫자 형식이 아니네요.");
		} catch(Exception e) {
			System.out.println("알 수 없는 예외가 발생했습니다.");
		}
	}

	public static void main(String[] args) {
		new Test08();
	}
	
	//	숫자를 입력받아서 정수로 변환 후 10을 더해서 반환해주는 함수 
	public int addNum() throws NumberFormatException, Exception{
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		String sno = sc.nextLine();
		//	만약 5가 입력되면 강제로 예외 발생
		if (sno.equals("5")) {
			throw new Exception();
		}
		//	정수 변환
		int no = Integer.parseInt(sno);
		
		result = no + 10;
		return result;
		
	}
}
