package day04.ex;
/*
 	���� 7 ]
	�����ϰ� ���ڸ� ���ڸ� �����
	����ڰ� ������ ���ڸ� �Է��ؼ�
	�Է��� ���� �߻��� ������ ū�� ������ �ƴϸ� �������� 
	������ִ� ���α׷��� �ۼ��ϼ���.
 */
import java.util.*;
public class Ex07 {

	public static void main(String[] args) {
		int rnum = (int)(Math.random() * (99 - 10 + 1) + 10);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����ڰ� ������ ���� : ");
		int pnum = sc.nextInt();
		
		String result = "";
		
		if(rnum > pnum) {
			result = (rnum + "��" + pnum + " ���� ũ��.");
		}
		else if (rnum < pnum) {
			result = (rnum + "��" + pnum + " ���� �۴�.");
		}
		else
			result = (rnum + "��" + pnum + " �� ����.");
		
		System.out.println("������ " + rnum + " �� " + pnum + " �� ���ؼ�" + result);
	}

}
