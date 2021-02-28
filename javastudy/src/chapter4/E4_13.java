package chapter4;
/*
 	주어진 문자열이 숫자인지를 판별하는 프로그램
 */
public class E4_13 {

	public static void main(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i = 0; i < value.length(); i++) {
			if(!(value.charAt(i) >= '0' && value.charAt(i) <= '9')) {
				isNumber = false;
				break;
			}
		}
		if(isNumber) {
			System.out.println(value + "는 숫자입니다.");
		}else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}
	}
}
