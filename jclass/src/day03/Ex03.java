package day03;
/*
 	���� 3] 
 		ȭ�� �µ� 100���� 
 		�����µ� �� �������� �˾ƺ��� ���α׷��� �ۼ��ϼ���/
 	
 	����]
 		���� �µ� = 5 / 9 * (ȭ���µ� - 32)
 */
import java.util.*;
public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ȭ�� �µ��� �Է��ϼ��� : ");
		int f = sc.nextInt();
		double c = (f - 32) * 5 / 9.0;
		
		System.out.println("���� �µ��� : " + c + " �Դϴ�.");
	}
	
	/*
	 	int fer = 100;
	 	
	 	double cel = 5 / 9.0 * (fer - 32);
	 	System.out.println(
	 */

}
