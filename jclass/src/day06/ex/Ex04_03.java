package day06.ex;
// 3. 1 ~ 100 ������ ���� ���ϴµ� Ȧ���鸸�� ���� ���ϼ���.
public class Ex04_03 {
	public static void main(String[] args) {
		

		int sum = 0;
		for(int i = 1; i<=100; i++) {
			if(i%2==1) {
				sum = sum + i;
				System.out.println(i);
			}
		}
		System.out.println("Ȧ���� �� : " + sum);
	}

}
