package day05.ex;
/*
 	����3]
 		�����ϰ� ���ڸ� ���ڸ� �ϳ� �߻����Ѽ� 
 		����ڰ� �� ���ڸ� �˾Ƹ��ߴ� ������ �����ϼ���.
 		������� ���ں��� ū ���� �Է��� ���� "ū���Դϴ�."
 		�������� �Է��� ���� "���� �� �Դϴ�." �� ��µǵ��� �ϰ� 
 		������ ���⶧���� �ݺ��ϵ��� �ϼ���.
 */
import java.util.*;
public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			int enter = sc.nextInt();
			String result = "";	
			int num = (int)(Math.random() * (99-10+1)+10);
			
			if(enter == num) {
				break;
			}
				if(enter > num) {
					result = "ū ���Դϴ�.";
				}
				else 
					result = "���� ���Դϴ�.";
			
			System.out.println("�������ڴ�" + num + "�Է��� ���ڴ�" + enter + "�����" + result);
		}
		
	}
}
