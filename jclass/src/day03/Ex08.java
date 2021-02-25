package day03;

/*
 	문제8]
	알파벳 문자 하나를 입력한 후 그 문자가 대문자이면 소문자로 
	소문자이면 대문자로 변환시켜서 출력해주는 프로그램을 작성하세요.
	
 */
import java.util.*;
public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 문자를 입력하세요 : ");
		char alpha = sc.next().charAt(0);
		
		
		
		char sm = (char)(alpha + ('a' - 'A'));
		char bi = (char)(alpha - ('a' - 'A'));
		char result = ((alpha >= 'A' && alpha <= 'Z') ? 
							sm : ((alpha >= 'a' && alpha <= 'z') ? bi : sm));
		
		System.out.println("입력한 문자는 " + alpha + "변환 시킨 문자는 " + result);
		
		
	}

}
