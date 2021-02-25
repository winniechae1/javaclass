package day04.ex;

/*
 	String 클래스의 equals() 함수를 사용해서 처리하세요.
 	
 	문자열을 입력받아서 
 		"M" - 남자입니다.
 		"남" - 남자입니다.
 		"남자" - 남자입니다.
 		"남성" - 남자입니다.
 		"F" - 여자입니다.
 		"여" - 여자입니다.
 		"여자" - 여자입니다.
 		"여성" - 여자입니다.
 		이외의 경우는 - 잘못입력했습니다.
 		가 출력되는 프로그램을 작성하세요.
 */
import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		String result = "";
		switch (str) {
		case "M" :
			result = "남자입니다.";
		break;
		case "남" :
			result = "남자입니다.";
		break;
		case "남자" :
			result = "남자입니다.";
		break;
		case "남성" :
			result = "남자입니다.";
		break;
		case "F" :
			result = "남자입니다.";
		break;
		case "여" :
			result = "남자입니다.";
		break;
		case "여자" :
			result = "남자입니다.";
		break;
		case "여성" :
			result = "남자입니다.";
		break;
		default : 
			result = "잘못 입력했습니다.";
		}
		System.out.println("입력한 문자열 " + str + " 은 " + result );
	}
}
