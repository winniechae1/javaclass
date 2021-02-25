package day06.ex;
// 3. 1 ~ 100 까지의 합을 구하는데 홀수들만의 합을 구하세요.
public class Ex04_03 {
	public static void main(String[] args) {
		

		int sum = 0;
		for(int i = 1; i<=100; i++) {
			if(i%2==1) {
				sum = sum + i;
				System.out.println(i);
			}
		}
		System.out.println("홀수의 합 : " + sum);
	}

}
