package day08.ex;
/*
f1 ~ f5 데이터를 이용해서
friend 배열의 데이터를 채우세요.
				j=0
i=0				친구1		친구2		친구3		친구4		친구5
이름		:	f1[0]		f2[0]		f3[0]		f4[0]		f5[0]
아이디		:	f1[1]		f2[1]		f3[1]
메일		:
전화번호	:
성별		:

*/
import java.util.Arrays;

public class Ex05_01 {

	public static void main(String[] args) {
		String[] f1 = {"홍길동", "hong", "hong@increpas.com", "010-7777-7777", "M"};
		String[] f2 = {"고길동", "Gho", "gho@increpas.com", "010-8888-8888", "M"};
		String[] f3 = {"둘리", "dooly", "dooly@increpas.com", "010-2222-2222", "M"};
		String[] f4 = {"희동이", "dongee", "dongee@increpas.com", "010-1111-1111", "M"};
		String[] f5 = {"마이콜", "mikol", "mikol@increpas.com", "010-3333-3333", "M"};
		 
		
		
		String[][] friend = new String[5][5];
		 
		System.arraycopy(f1, 0, friend[0], 0, f1.length);
		System.arraycopy(f2, 0, friend[1], 0, f2.length); 
		System.arraycopy(f3, 0, friend[2], 0, f3.length); 
		System.arraycopy(f4, 0, friend[3], 0, f4.length); 
		System.arraycopy(f5, 0, friend[4], 0, f5.length); 
		
	
		for(int i = 0; i < friend.length; i++) {
			friend[i][0] = f1[i];
			friend[i][1] = f2[i];
			friend[i][2] = f3[i];
			friend[i][3] = f4[i];
			friend[i][4] = f5[i];
			
		}
		//출력
		for(String[] s : friend) {
			System.out.println(Arrays.toString(s));
		}
		System.out.println();
		
		
	}
}

