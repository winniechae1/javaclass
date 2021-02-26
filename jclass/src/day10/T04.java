package day10;

import java.util.Arrays;

/*
	정수 5개를 기억할 배열을 만들고 
	이 배열에 랜덤한 정수를 발생시켜서 채워주는 기능의 함수를 작성해서 실행하세요.
	배열의 내용을 출력하세요.
*/
public class T04 {
	
	int[] num = new int[5];
	
	public T04() {
		setNum();
		System.out.println(Arrays.toString(num));
	}
	public static void main(String[] args) {
		new T04();
	}
	
	void setNum() {
		for(int i = 0; i < num.length; i++) {
			int no = (int)(Math.random() * 9 + 1);
			num[i] = no;
		}
	}

}
