package day05_run;
/*
���� �Է¹޾Ƽ�
�ش� ���� �������� ������ִ� ���α׷��� �ۼ��ϼ���.
-----------------------------------------
���� ����ϸ� �ٽ� ���� �Է¹޵��� �ϰ�
0�� �Է��ϸ� ���α׷� ����ǵ��� 
���α׷��� �ۼ��ϼ���.
*/
import java.util.*;
public class T04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� �Է��ϼ���: ");
			int dan = sc.nextInt();
			if(dan == 0) {
				System.out.println("���α׷��� ����ƽ��ϴ�.");
				break;
			}
			System.out.println("****" + dan + "�� ****");
			for(int gop=1; gop<10; gop++) {
				System.out.println(dan + " x " + gop + " = " + (dan*gop));
			}
		}
		}
	}

