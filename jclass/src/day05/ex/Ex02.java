package day05.ex;
/*
 	����2]
 		�ټ��ڸ��� ���ڸ� �����ϰ� �߻���Ų �� 
 		�� �ڸ��� ���� �����ִ� ���α׷��� �ۼ��ϼ���.
 		�� , �ݺ����� ����ؼ� ó���ϼ���.
 		
 		��Ʈ]
 			charAt() - ���ڿ��� Ư����ġ�� ���ڸ� �����ִ� �Լ� 
 			Integer.parseInt() - ���������� ���ڿ��� ������ ��ȯ�����ִ� �Լ� 
 		
 		��Ʈ2] 
 			������ 10���� ������ ���ڸ��� �پ���.
 */
public class Ex02 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * (99999-10000+1)+10000);
		System.out.println(num);
		
		System.out.println(num%10);
		for(int i = 0; i < 4; i++) {	
				num /= 10;
				System.out.println(num%10);			
				
		}
		
	}

}
