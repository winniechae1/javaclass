package day07.ex;

import java.util.Arrays;

/*
 	문제2]
 		정수 10개를 기억할 배열을 만들고 
 		이 배열에  0 ~ 9 사이의 정수 100개를 발생시켜서 발생된 숫자의 
 		횟수를 기억시키고 결과를 출력하세요.
 		
 */
public class Ex02 {

	public static void main(String[] args) {
		int [] num = new int[10];
		
		for(int i = 0; i < 100; i++) {
			int no = (int)(Math.random() * 10);
			num[no]++;
		}
		System.out.print(Arrays.toString(num));
		
		for(int j = 0; j < num.length; j++) {
			System.out.print(j + "  :  ");
			for(int k = 0; k < num[j]; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		


	}

}
