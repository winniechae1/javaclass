package day10.ex;

import java.util.Arrays;

/*
 	5과목의 점수를 랜덤하게 발생시켜서 배열로 반환해주는 함수를 작성하고 실행해서 출력하세요.
 	
 	전역변수로 배열변수를 만들어서 실행하는 것이 아니다. 
 */
public class Ex02_00 {
	/*
	public Ex02_00() {
		int Array[];
		Array = func();
		for(int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]);
		}
		
		
	}
	public static void main(String[] args) {
		new Ex02_00();
	}
	
	int[] func() {
		
		int[] score = new int[5];
		for(int i = 0; i < score.length; i++) {
			int num = (int)(Math.random() * 50 + 60);
			score[i] = num;
		}
		return score;
	}
*/	
	public Ex02_00() {
		// 1. 내용만 바로 살펴보는 방법
		System.out.println(Arrays.toString(getScore()));
	
		// 2. 변수에 반환값을 기억시켜서 출력하는 방법
		int[] score = getScore();
		
		// 3. 내용 출력
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
	}
	public static void main(String[] args) {
		new Ex02_00();
	}
	// 랜덤하게 점수를 발생시켜서 5과목에 점수를 반환해주는 함수 
	// 함수는 반환값이 하나로 만들어져야 한다. 
	// 같은 타입의 데이터 5개를 관리할 수 있는 타입으로 반환해주면 된다.
	// 따라서 이 경우는 정수 5개를 반환해줘야 하기 때문에 정수 배열로 반환해주면 된다.
	public int[] getScore() {
		// 이 함수는 필요한 데이터를 함수 내부에서 처리하면 되기 때문에 
		// 입력 받아야 할 데이터가 필요없다. 
		
		// 반환값 함수 만들고 
		int[] score = new int[5];
		
		// 배열 채워주고 
		for(int i = 0; i < score.length; i++) {
			int num = (int)(Math.random() * 50 + 60);
			score[i] = num;
		}
		
		// 데이터 반환해주고 
		return score;
	}
}
