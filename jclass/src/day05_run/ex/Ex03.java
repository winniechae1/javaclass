package day05_run.ex;
/*
���� 3 ]
	�����ϰ� ���ڸ� ���ڸ� �ϳ� �߻����Ѽ�
	����ڰ� �� ���ڸ� �˾Ƹ��ߴ� ������ �����ϼ���.
	������� ���ں��� ū ���� �Է��� ���� 
		- "ū���Դϴ�."
	�������� �Է��� ���� 
		- "���� �� �Դϴ�."
	�� ��µǵ��� �ϰ�
	������ ���⶧ ���� �ݺ��ϵ��� �ϼ���.
*/
import java.util.*;
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random() * (99-10+1)+10);
	
		while(true) {
			System.out.print("���ڸ� ���ڸ� �Է��ϼ��� : ");
			int enter = sc.nextInt();
			
			if(enter>num) {
				System.out.println(num + "���� ū ���Դϴ�.");
			}else if (enter < num) {
				System.out.println(num + " ����" + enter +" �� ���� ���Դϴ�.");
			}else if (enter == num) {
				System.out.println("�����Դϴ�.");
			}else
				System.out.println("�߸��Է��߽��ϴ�.");
			
			
		
		}
	}
}