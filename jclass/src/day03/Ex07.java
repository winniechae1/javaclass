package day03;
/*
 	���� 7]
	���� 3���� ���Ƿ� �߻��� �� ���� ū ���ڸ� �����ؼ� ����ϴ� ���α׷��� �ۼ��ϼ���. 
	��, 3�� �����ڸ� ����ؼ� ó���ϼ���. 
	(�ɼ� - ���ǹ����� ó��)
*/
 
public class Ex07 {

	public static void main(String[] args) {
		int num1 = (int)(Math.random() * (1000 - 1 + 1) * 1 );
		int num2 = (int)(Math.random() * (1000 - 1 + 1) * 1 );
		int num3 = (int)(Math.random() * (1000 - 1 + 1) * 1 );
		
		
		int result = ((num1 > num2 ) ? 
								((num1> num3) ? num1 : num3) : 
										((num2 > num3) ? num2 : num3 ));
		System.out.println("ù��° �� : " + num1 + " �ι�° �� " + num2 + " ����° �� " + num3);
		System.out.println("���� ū ���� : " + result);
		
	}

}
