package day16;

import java.util.*;
public class Test08 {

	public Test08() {
		int no = 0;
		try {
			no = addNum();
		} catch(NumberFormatException e) {
			System.out.println("���� ������ �ƴϳ׿�.");
		} catch(Exception e) {
			System.out.println("�� �� ���� ���ܰ� �߻��߽��ϴ�.");
		}
	}

	public static void main(String[] args) {
		new Test08();
	}
	
	//	���ڸ� �Է¹޾Ƽ� ������ ��ȯ �� 10�� ���ؼ� ��ȯ���ִ� �Լ� 
	public int addNum() throws NumberFormatException, Exception{
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String sno = sc.nextLine();
		//	���� 5�� �ԷµǸ� ������ ���� �߻�
		if (sno.equals("5")) {
			throw new Exception();
		}
		//	���� ��ȯ
		int no = Integer.parseInt(sno);
		
		result = no + 10;
		return result;
		
	}
}
