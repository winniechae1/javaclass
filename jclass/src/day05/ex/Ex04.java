package day05.ex;
/*
	���� 4 ]
		�ټ��ڸ� ���ڸ� �Է¹޾Ƽ�
		�Է¹��� ���ڰ� ȸ�������� �ƴ�����
		�Ǻ����ִ� ���α׷��� �����ϼ���.
		
		���� ]
			
			ȸ���� : �տ��� ������ �ڿ��� ������ ���� ����.
				�� ]
					12321
					45654
					
				�ƴѿ� ]
					12345
					12312
*/
import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5�ڸ� ���ڸ� �Է��ϼ��� : ");
		String sno = sc.nextLine();
		
		String result = "ȸ�����Դϴ�.";
		for(int i = 0; i < 2; i++) {
			char ch = sno.charAt(i);
			char ch1 = sno.charAt(4-i);
			/*
			 * 
			 */
			if(ch != ch1) {
				/*
				 	12345 
				 		ù��° ���ϴµ� 1�� 5�� ������ ���� ���̹Ƿ� 
				 		�̶� �ٸ��ٴ� ����� ���´�.
				 		�̼���
				 			�� ���ڴ� ȸ������ �ƴϰ� �ȴ�
				 		���� ���̻��� �۾��� ���ǹ��ϴ�.
				 */
				result = "ȸ������ �ƴմϴ�.";
				break;
			}
		}
		System.out.println("�Է��� ����"+ sno + " ��" +result);
	}

}
