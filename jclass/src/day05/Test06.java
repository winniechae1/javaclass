package day05;
/*
 	10 ~ 49 ������ �� �� ���� �ϳ��� �Է¹޾Ƽ� 
 	
	10 ~ 19 : �ѹ���
	20 ~ 29 : ������
	30 ~ 39 : ȸ���
	40 ~ 49 : ���ߺ�
	�� ��� �ݺ��ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	 
	99�� �Է��ϸ� ����ǵ��� �ϼ���.
*/
import java.util.*;
public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("�μ���ȣ�� �Է��ϼ��� : ");
			int dno = sc.nextInt();
			if(dno == 99) {
				System.out.println("*** ���α׷��� �����մϴ�. ***");
				break;
			}
			String dname = "";
			
			switch(dno/10) {
			case 1:
				dname = "�ѹ���";
				break;
			case 2:
				dname = "������";
				break;
			case 3:
				dname = "ȸ���";
				break;
			case 4:
				dname = "���ߺ�";
				break;
			case 9:
				break;
			default:
				dname = "���� �μ�";
						}
			
			System.out.println("�Է���" + dno + "�μ���" + dname + "�Դϴ�.");
		
			}
		

	}

}
