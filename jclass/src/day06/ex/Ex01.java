package day06.ex;
/*
	����1]
		
		1 + 1 + 2 + 1 + 2 + 3 + 1 + 2 + 3 + 4 + .... + 19 + 20
		�� ���� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
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
