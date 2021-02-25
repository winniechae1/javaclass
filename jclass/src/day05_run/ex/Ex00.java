package day05_run.ex;
/*
1 ~ 100 까지 합을 구해주는 프로그램을 작성하세요..
*/
public class Ex00 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			sum += (i+1);
			
		}
		System.out.println("1~100까지의 합 : " + sum);
	}

}
