package day06.ex;

// 2. 두자리의 랜덤한 숫자 10개를 발생시켜서 합을 구하는 프로그램을 작성하세요.
public class Ex04_02 {
	public static void main(String[] args) {
		
		
		int sum = 0;
		for(int i = 0; i<10; i++) {
			int no1 = (int)(Math.random() * (99-10+1)+10);
			System.out.println(no1);
			sum = sum + no1;	
		}
		System.out.println("10개의 합 : " + sum);
	}
}
