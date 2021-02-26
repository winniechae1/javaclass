package day08.ex;

import java.util.Arrays;

public class Ex05_02 {

	public static void main(String[] args) {
		String[] f1 = {"홍길동", "hong", "hong@increpas.com", "010-7777-7777", "M"};
		String[] f2 = {"고길동", "Gho", "gho@increpas.com", "010-8888-8888", "M"};
		String[] f3 = {"둘리", "dooly", "dooly@increpas.com", "010-2222-2222", "M"};
		String[] f4 = {"희동이", "dongee", "dongee@increpas.com", "010-1111-1111", "M"};
		String[] f5 = {"마이콜", "mikol", "mikol@increpas.com", "010-3333-3333", "M"};
		
		
		/*
			f1 ~ f5 데이터를 이용해서
			friend 배열의 데이터를 채우세요.
			
							친구1		친구2		친구3		친구4		친구5
			이름		:
			아이디		:
			메일		:
			전화번호	:
			성별		:
			
			==> 
			friend 에서 데이터를 꺼내서
			
			String[][] friend1 = new String[5][5];
			
						이름	아이디	메일	전화번호 	성별
			친구1	: 
			친구2   :
			친구3	:
			친구4	:
			친구5	:
		 */
		
		String[][] friend1 = new String[5][5];
		
		System.arraycopy(f1, 0, friend1[0], 0, f1.length);
		System.arraycopy(f2, 0, friend1[1], 0, f2.length); 
		System.arraycopy(f3, 0, friend1[2], 0, f3.length); 
		System.arraycopy(f4, 0, friend1[3], 0, f4.length); 
		System.arraycopy(f5, 0, friend1[4], 0, f5.length); 
		
		String[][] friend = new String[5][5];

		for(int i=0; i<5; i++) {

			for(int j=0; j<5; j++) {

				friend[i][j] = friend1[i][j];

			}
 
		}
		for(String[] f : friend) {
			System.out.println(Arrays.toString(f));
		}
		
	}

}
