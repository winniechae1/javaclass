package jungsuk1;
/*
 	문자형 변수 ch가 영문자(대문자 또는 소문자) 이거나 숫자일 때만 
 	변수 b의 값이 true 가 되도록 하는 코드이다.
 */
public class E3_9 {

	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || ( ch >= 0 && ch <= 9));
		
		System.out.println(b);
	}

}
