package chapter4;
/*
 	���� num �� ���� 12345 �� 1 + 2 + 3 + 4 + 5 �� ����� ����ϼ���.
 */
public class E4_10 {

	public static void main(String[] args) {
		
		int num = 12345;
		int sum = 0;
		int tmp = num;
		for(int i = 0; i < 5; i++) {
			sum = sum + (tmp%10);
			tmp = tmp / 10 ;

		}
		System.out.println("sum = " + sum);

	}

}
