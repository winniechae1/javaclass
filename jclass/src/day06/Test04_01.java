package day06;

import java.util.Arrays;

/*
5개의 메모리를 배열로 만들고
그 안에 랜덤한 숫자(정수)를 입력한 후 출력하자.
*/
public class Test04_01 {
	public static void main(String[] args) {
		
		int[] num = new int[5];
		
		num[0] = (int)(Math.random() * 45 + 1);
		num[1] = (int)(Math.random() * 45 + 1);
		num[2] = (int)(Math.random() * 45 + 1);
		num[3] = (int)(Math.random() * 45 + 1);
		num[4] = (int)(Math.random() * 45 + 1);
		
		System.out.println(Arrays.toString(num));
	}
}
