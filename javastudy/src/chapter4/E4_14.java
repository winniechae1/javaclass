package chapter4;
/*
 	���� ���߱� ����  1�� 100������ ���� ���������� �Է��ؼ� 
 	��ǻ�Ͱ� ������ ���� ���߸� ������ ������.
 */
import java.util.*;
public class E4_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
			int input = sc.nextInt();
			
			int comp = (int)(Math.random() * 100 + 1); 
			count++;
			if(input == comp) {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� " + count + "�Դϴ�.");
				break;
			}else if(comp > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}else{
				System.out.println("�� �������� �Է��ϼ���.");
				
			}
		}
		
	}

}
