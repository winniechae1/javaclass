package day06;

import java.util.Arrays;

/*
5개의 메모리를 배열로 만들고
그 안에 랜덤한 숫자(정수)를 입력한 후 출력하자.
*/
public class Test04 {
	public static void main(String[] args) {
		
		int[] num = new int[6];
		/*
		num[0] = (int)(Math.random() * 45 + 1);
		num[1] = (int)(Math.random() * 45 + 1);
		num[2] = (int)(Math.random() * 45 + 1);
		num[3] = (int)(Math.random() * 45 + 1);
		num[4] = (int)(Math.random() * 45 + 1);
		num[5] = (int)(Math.random() * 45 + 1);
		*/
		
		for(int i = 0; i < 6; i++) {
			num[i] = (int)(Math.random() * 45 + 1);
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]+ " | ");
		}
		
		String str = Arrays.toString(num);
//		System.out.println(Arrays.toString(num));
		System.out.println(str);
	}
}
