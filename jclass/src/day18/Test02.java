package day18;
/*
 	 특정 문자열을 입력한 후 그 문자열 중 규칙에 맞는 부분만 골라서 출력해보자.
 	
 */
import java.util.regex.*;
public class Test02 {

	public Test02() {
		String tell = "곽채원 : 010-2402-4746";
		//	이 문자열 중에서 전화번호만 꺼내보자.
		String pattern = "01[0-9]-[0-9]{4}-[0-9]{4}";
		//	1. 정규식 검사 
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(tell);
		
		if(m.find()) {
			String group = m.group();
			System.out.println("내 전화번호 : " + group);
		}
	
	}

	public static void main(String[] args) {
		new Test02();
	}

}
