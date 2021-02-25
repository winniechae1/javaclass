package day03;

/*
 	문제]
 		정수를 입력받아서 
 		짝수이면 "짝수입니다." 
 		홀수이면 "홀수입니다."
 		0이면 "0입니다."
 */
import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = (num == 0) ? "0입니다." : 
							(( num % 2 == 0 ) ? ("짝수입니다.") : ("홀수입니다." ));
		String result1 = (num % 2 == 0) ? ((num == 0) ? "0" : "짝수" ) : "홀수 " ;
		System.out.println(num + " 은" + result);
		System.out.println("입력받은 수 " + num + " 는" + result);
		
		
	}

}
