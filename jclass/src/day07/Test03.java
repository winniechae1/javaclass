package day07;

import java.util.Arrays;

/*
 
 	1 ~ 50 사이의 정수 10개를 기억할 배열을 만들고 
 	랜덤하게 정수를 입력한 후 입력된 수 중 제일 큰 수를 
 	출력해주는 프로그램을 작성하세요.
 	배열에 담긴 내용도 같이 출력하세요.
 */
public class Test03 {
	public static void main(String[] args) {
//		정수 10개를 기억할 변수를 만든다.
		int[] num = new int[10];
//		배열에 랜덤하게 정수를 채우고 
		for(int i = 0; i < 10; i++) {
			int no = (int)(Math.random() * 50 + 1);
			num[i] = no;
		}
//		제일 큰 수를 찾고 
//		먼저 첫번째 방에 채워진 데이터를 변수에 기억시킨다.
		int max = num[0];
//		출력해준다.
		for(int i = 1; i < num.length; i++) {
			// 두번째 방부터 데이터를 꺼내고 
			int tmp = num[i];
//			비교한다.
//			tmp가 max보다 크면 tmp로 max를 대체하고 .. 
			max = (max < tmp) ? tmp : max;
		}
//		배열 내용 출력하고 
		System.out.println(Arrays.toString(num));
//		제일 큰 수 출력하고 
		System.out.println("제일 큰 수 :  " + max);
	}
}
