package day02;
/*
 	반지름이 5인 원의 둘레를 출력하는 프로그램을 작성하세요.
 */

// 연산의 결과를 기억하려면 대입연산자가 필요하다.
import java.util.*;
public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 : ");
		System.out.println("반지름이 5인 원의 둘레는" + (2 *(sc.nextInt()) * 3.14));
		/*
		 	위에 출력 내용 중 연산결과만 다시 사용하려고 한다면 다시 연산해줘야 한다. 
		 */
	}

}
