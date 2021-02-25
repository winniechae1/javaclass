package day02;
/*
 	문제3]
	삼각형의 밑변과 높이를 정수로 입력받아서 
	넓이를 출력해주는 프로그램을 작성하세요.
	 
 */
import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삼각형의 밑변 : ");
		int base = sc.nextInt();
		
		System.out.print("삼각형의 높이 : ");
		int height = sc.nextInt();
		
		double triarea = base * height * 0.5;
		/*
		 	double area = width * height / 2;
		 	연산식을 이렇게 기술하면 
		 	연산결과는 정수로 만들어질 것이고 소수점 이하는 버리는 데이터가 
		 	만들어진다. 정수 데이터는 실수보다 항상 작으므로 실수에 담을 수 있고 
		 	따라서 오류는 발생하지 않는다. 하지만 원하는 결과값은 얻지못할 수 있다.
		 */
		
		System.out.println("삼각형의 밑변 " + base + "삼각형의 높이" + height + "인 삼각형의 넓이는 " + triarea + "입니다");
		// System.out.printf("%s : %"

	}

}
