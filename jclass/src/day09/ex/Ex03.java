package day09.ex;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		
		int[][] std = new int[10][6];
		
		for(int i = 0; i < std.length; i++) {
			for(int j = 0; j < std[i].length-1; j++) {
				int score = (int)(Math.random() * (99-70+1)+70);
				std[i][j] = score;
				std[i][std[i].length-1] += std[i][j];
			}
			System.out.println(Arrays.toString(std[i]));
		}
		System.out.println("#####Á¤·ÄÈÄ#####");
		for(int i = 0; i < std.length-1; i++) {
			for(int j = i+1; j <std.length; j++) {
				int t1 = std[i][5];
				int t2 = std[j][5];
				if(t2 > t1) {
					int [] tmp = std[i];
					std[i] = std[j];
					std[j] = tmp;
				}
			}
			System.out.println(Arrays.toString(std[i]));
		}
			
		}

	}


