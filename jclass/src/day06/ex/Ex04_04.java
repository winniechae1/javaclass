package day06.ex;

/*
	4. ù���� 1���� �����ϰ� �������� ������ 2�踦 �����Ѵٸ� 
    	��ĥ° 1����� ������ �� �ִ� �� ������ִ� ���α׷��� �ۼ��ϼ���.
 */
public class Ex04_04 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		int save = 1;
		while(true) {
			
			sum = sum + save;
			save = save * 2;
			if(sum > 1000000000) {
				break;
			}
			System.out.println(save);
		}
	}
}