package day06.ex;

// 2. ���ڸ��� ������ ���� 10���� �߻����Ѽ� ���� ���ϴ� ���α׷��� �ۼ��ϼ���.
public class Ex04_02 {
	public static void main(String[] args) {
		
		
		int sum = 0;
		for(int i = 0; i<10; i++) {
			int no1 = (int)(Math.random() * (99-10+1)+10);
			System.out.println(no1);
			sum = sum + no1;	
		}
		System.out.println("10���� �� : " + sum);
	}
}
