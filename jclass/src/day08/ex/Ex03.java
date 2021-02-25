package day08.ex;

import java.util.Arrays;

/*
문제 3 ]
	2번 문제에서 만든 배열을 
	총점을 기준으로 내림차순 정렬하세요.
	
	옵션 ]
		첫번째 과목순으로 정렬,
		두번째 과목 순으로 정렬,
		세번째 과목 순으로 정렬
*/
public class Ex03 {

	public static void main(String[] args) {
		
		int[][] std = new int[5][4];
		
		for(int i = 0; i < std.length; i++) {
			for(int j = 0; j < std[i].length-1; j++) {
				int score = (int)(Math.random() * (99-70+1)+70);
				std[i][j] = score;
				std[i][std[i].length-1] = std[i][std[i].length-1] + score;
			}
			System.out.println(Arrays.toString(std[i]));
		}
		
		for(int i = 0; i < std.length-1; i++) {
			for(int j = i+1; j < std.length; j++) {
				int t1 = std[i][3];
				int t2 = std[j][3];
				if(t2 > t1) {
					int[] tmp = std[i];
					std[i] = std[j];
					std[j] = tmp;
				}
			}
		}
		System.out.println("### 정렬 후 ###");
		for(int[] t : std) {
			System.out.println(Arrays.toString(t));
		}
		
		for(int i = 0; i < std.length-1; i++) {
			for(int j = i+1; j < std.length; j++) {
				int t1 = std[i][0];
				int t2 = std[j][0];
				if(t2 > t1) {
					int[] tmp1 = std[i];
					std[i] = std[j];
					std[j] = tmp1;
				}
			}
		}
		System.out.println("### 정렬 후 ###");
		for(int[] s : std) {
			System.out.println(Arrays.toString(s));
		}
		
		for(int i = 0; i<std.length-1; i++) {
			for(int j = i+1; j < std.length; j++) {
				int t1 = std[i][1];
				int t2 = std[j][1];
				if(t2 > t1) {
					int[] tmp2 = std[i];
					std[i] = std[j];
					std[j] = tmp2;
				}
			}
		}
		System.out.println("###두번째 과목 정렬 후 ###");
		for(int[] two : std) {
			System.out.println(Arrays.toString(two));
		}
		
		for(int i = 0; i < std.length-1; i++) {
			for(int j = i+1; j < std.length; j++) {
				int t1 = std[i][2];
				int t2 = std[j][2];
				if(t2 > t1) {
					int[] tmp3 = std[i];
					std[i] = std[j];
					std[j] = tmp3;
				}
			}
		}
		System.out.println("###세번째 과목 정렬 후###");
		for(int[] th : std) {
			System.out.println(Arrays.toString(th));
		}
	}
	

}
