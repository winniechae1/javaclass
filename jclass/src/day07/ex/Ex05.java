package day07.ex;

import java.util.Arrays;

/*
 	문제5]
 		int[][] stud = new int[5][6];
 		
 		int[] score = new int[6];
 		
 		다섯 명의 학생의 5과목의 점수를 기억할 배열을 만들고 
 		랜덤하게 점수를 입력해서 
 		맨 마지막 방에는 총점을 계산해서 넣고 
 		
 		stud[i] = score;
 		총점이 제일 높은 사람부터 정렬을 해서 출력하세요.
 	
 	참고]
 		배열안에 배열을 다시 넣을 수 있다. 
 		이때 주의사항은 배열에서 하나를 꺼낸 것은 배열이라는 것을 기억해야 한다. 
 		
 */
public class Ex05 {

	public static void main(String[] args) {
		
		int[][] std = new int[5][6]; // [학생수][5과목+총점]
		 
		
		for(int i = 0; i < std.length; i++) {
//			std[i] >> 배열을 꺼내게 된다
			for(int j = 0; j < std[i].length-1; j++) {
				// std[i] >> 배열
				// std[i].length >> i 번째 배열의 길이
				int score = (int)(Math.random() * 41 + 60);
				std[i][j] = score;
				std[i][std[i].length -1] += score;
			}
//			System.out.println(Arrays.toString(std[i]));
			 
			/*
			// 총점 계산
			// 지금은 i 번째 방에 들어있는 배열을 꺼낸 상태
			for(int j = 0; j < std[i].length - 1; j++) {
				int no = std[i][j];
				std[i][std[i].length -1] += no;
			}
			
			*/
			System.out.println(Arrays.toString(std[i]));
		}
		// 정렬한다.
		// 총점이 제일 높은 사람이 맨 앞에 오도록 하면 된다.
		// 이때 총점이 높으면 주소를 맨 앞자리로 옮겨준다.
			for(int i = 0; i < std.length -1; i++){
				for(int j = i+1; j < std.length; j++) {
					int t1 = std[i][5];
					int t2 = std[j][5];
					if(t2 > t1) {
						int[] tmp = std[i]; // 배열 주소를 기억할 임시변수 
						std[i] = std[j];	// j번째 주소를 i번째에 기억, i번째와 j번째에는 같은 주소가 기억되어있다.
						std[j] = tmp;		// 임시변수에 기억된 주소를 j번째에 바꿔주고 
					}
				}
			}
			System.out.println("###### 정렬 후 ######");
			for(int[] t : std) {
				System.out.println(Arrays.toString(t));
			}
		// 위 결과를 첫번째 과목을 기준으로 정렬해서 출력하세요.
			
			for(int i = 0; i < std.length -1; i++) {
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
			System.out.println("####### 첫번째 정렬 후 #######");
			for(int[] s : std) {
				System.out.println(Arrays.toString(s));
			}
	}

}
