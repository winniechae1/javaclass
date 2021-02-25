package day03;
/*
 	문제 3] 
 		화씨 온도 100도는 
 		섭씨온도 몇 도인지를 알아보는 프로그램을 작성하세요/
 	
 	공식]
 		섭씨 온도 = 5 / 9 * (화씨온도 - 32)
 */
import java.util.*;
public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨 온도를 입력하세요 : ");
		int f = sc.nextInt();
		double c = (f - 32) * 5 / 9.0;
		
		System.out.println("섭씨 온도는 : " + c + " 입니다.");
	}
	
	/*
	 	int fer = 100;
	 	
	 	double cel = 5 / 9.0 * (fer - 32);
	 	System.out.println(
	 */

}
