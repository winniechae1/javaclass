package day17;

import java.util.*;
public class Test02 {

	public Test02() {
		Scanner sc = new Scanner(System.in);
		
		try {
			while(true) {
				System.out.print("�����Է� : ");
				int no = sc.nextInt();
				if(no == 0) {
						// �� ���� ������ MyException ���ܸ� �߻����Ѿ� �Ѵ�.
						throw new MyException();
				} else if(no == -1) {
					break;
				}
				
				System.out.println("no : " + no);
			}
		} catch(MyException e) {
//			System.out.println(e);
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test02();
	}
	
	public class MyException extends Exception {
		// ���� ���� Ŭ����
		// �� Ŭ������ 0 �� �ԷµǸ� �߻��Ǵ� ����� ���� ���ܸ� ó�����ִ� Ŭ����
		// ���� ������ ������ 0�� �ԷµǾ��ٴ� ���� �˷��ִ� ���� �ǰڴ�.
		public String toString() {
			return "*** ���� : 0 �� �ԷµǾ����ϴ�.";
		}
	}
}