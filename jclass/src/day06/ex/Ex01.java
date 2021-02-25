package day06.ex;
/*
	문제1]
		
		1 + 1 + 2 + 1 + 2 + 3 + 1 + 2 + 3 + 4 + .... + 19 + 20
		의 더한 결과를 출력하는 프로그램을 작성하세요.
*/
public class Ex01 {

	public static void main(String[] args) {
		
		int no = 0;
		int sum = 0;
		for(int i = 1; i <= 20; i++) {
			for(int j=1; j<=i; j++) {
				no++;
				sum = sum + no++;
			}
			System.out.print(no);
			System.out.println();
		
		}
		System.out.print(sum);
	}

	
}
