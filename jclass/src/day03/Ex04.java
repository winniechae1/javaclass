package day03;
/*
 	���� 4]
 		�Ҽ����� �ִ� ���ڸ� �Է¹��� �� 
 		�Ҽ� ���� ��° �ڸ����� �ݿø��� ����� ����ϼ���.
 		
 		��Ʈ]
 			�Ҽ� ��° �ڸ����� �ݿø��� �ϸ� 
 				+ 0.005 
 			�� �����ְ� �� ���ϴ� ������ �ȴ�. 
 			<< * 100 �� ����� ������ ���� ����ȯ�ϸ� ���ϴ� ������ ���ڰ� ���������.
 			�� ���ڸ� 100���� ���� �Ǽ��� ����� �ȴ�.
 */
import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ҽ����� �ִ� ���ڸ� �Է��ϼ��� : ");
		double num = sc.nextDouble();
		
		// 3. ����ؼ�(�ݿø� ����) --> 12.126
		//double result = ((int)((num + 0.005) * 100)) / 100.0;
		int num1 = (int)((num + 0.005) * 100); // --> 1213.1 --> 1213
		double num2 = num1 / 100.0;
		
		// 4. ����ϱ�
		System.out.println("�Է¹��� ���� : " + num);
		System.out.println("�ݿø��� ���� : " + num2);
		
		
		
		
	}

}
