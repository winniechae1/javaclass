package chap04;

import java.util.Scanner;

/*
 	����ڷκ��� �ݺ��ؼ� ���ڸ� �Է¹޴ٰ� 0�� �Է��ϸ� �Է��� ��ġ�� �� ���� ����ϴ� ����
 */
public class FlowEx27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum = 0;
		boolean flag = true;
		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���.(�������� 0�� �Է�)");
		
		while(flag) {
			System.out.print(">>");
			
			Scanner sc = new Scanner(System.in);
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num != 0) {
				sum += num;
			} else {
				flag = false;
			}
		}
		System.out.println("�հ� : " + sum);
	}

}
