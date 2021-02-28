package chap03;

public class WhileEx1 {
	public static void main(String[] args) {
		
		int sum, su;
		sum = su = 0;
		
		while (su <= 100) {
			sum += su;
			sum++;
		}
		System.out.println("1 ~ 100 까지의 합 : " + sum);
	}
}
