package day10.ex;

/*
	5과목의 점수를 랜덤하게 발생시켜서 배열로 반환해주는 함수를 작성하고 실행해서 출력하세요.
	
	전역변수로 배열변수를 만들어서 실행하는 것이 아니다. 
*/
public class E02 {
	
	public E02() {
		int[] ret = getScore();
		for(int i = 0; i < ret.length; i++) {
			System.out.print(ret[i] + " ");
		}
	}
	public static void main(String[] args) {
		new E02();
	}
	
	public int[] getScore() {
		
		int[] score = new int[5];
		for(int i = 0; i < score.length; i++) {
			int num = (int)(Math.random() * 40 + 60);
			score[i] = num;
		}
		return score;
	}
}
