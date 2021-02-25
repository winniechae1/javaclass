package day03;
/*
 	문제10]
	1000 ~ 3000 년 랜덤하게 발생시켜서 해당 년도가 윤년인지 평년인지를 구분해서 
	출력해주는 프로그램을 작성하세요.
	
	참고]
		윤년은 4로 나누어 떨어지는 해는 윤년 100으로 나누어 떨어지면 평년
		100으로 떨어지는 해 중 400으로 나눠 떨어지는 해는 윤년이라 한다. 
	 
 
public class Ex10 {

	public static void main(String[] args) {
		
		int year = (int)(Math.random() * (3000 - 2000 + 1) + 1000);
		  
		int pyeong = year % 100;
		int yoon = pyeong % 4;
		String result = "";
		if ( pyeong == 0) {
			result = "평년";
		}
		else if ( yoon == 0) {
			result = "윤년";
		}
		else 
			result = "평년도 윤년도 아니다.";
		System.out.println("해당년도가 " + year + "인 해는" + result);
	}

}
*/
import javax.swing.*;
public class Ex10 {

	public static void main(String[] args) {
		// 1. 입력받는다.
			String sno = JOptionPane.showInputDialog("해를 입력하세요! ");
		// 정수로 변환한다.	<< 정수연산이 필요하므로 정수로 변환한다. 
			int year = Integer.parseInt(sno);
		// 결과를 담을 변수 준비한다.
			String result = "";
		// 2. 구분처리한다.
			if(year % 400 == 0) {
				result = "윤년";
			} else if ( year % 100 == 0) {
				result = "평년";
			} else if ( year % 4 == 0) {
				result = "윤년";
			} else {
				result = "평년";
			}
		// 3. 결과 출력한다.
			JOptionPane.showMessageDialog(null, "입력한 해 [ " +
												sno + " ] 는 [ " + 
												result + " ] 입니다. "
				);
	}
}