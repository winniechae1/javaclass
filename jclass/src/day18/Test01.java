package day18;
//	�޴��� ��ȣ�� ���Խ� �˻縦 �غ���.

import java.util.regex.*;
public class Test01 {

	public Test01() {
		// TODO Auto-generated constructor stub
		/*
		 	���ڿ� �ȿ� " �� ǥ���Ϸ��� ����� ��Ȳ�� �߻��Ѵ�.
		 	�̶� ����ϴ� ���ڰ� �̽������� �����̴�.
		 	ǥ���Ϸ��� Ư������ �տ� \ �� �ٿ��ָ� �ȴ�.
		 */
/*		
		String str = "\"abcd\"";
		System.out.println("str : " + str);
		
		char ch = '\''; 
*/	
		String phone = "010-2402-4746";
		
	/*
	 	1.	Pattern Ŭ������ �̿��ؼ� �˻��ϰ� ���� ���Խ� ������ �����.
	 	����]
	 		�� Ŭ������ ������ �Լ��� ���������ڰ� private �� ������� ��쿡 �ش��Ѵ�.
	 		�׸��� �� Ŭ������ �Ӽ��� final �Ӽ��� ����Ǿ��ִ�. �� Ŭ������ ���̻� 
	 		��ӹ޾Ƽ� ����� �� ����.
	 		
	 		���� �� Ŭ������ �ܺο��� new ���Ѽ� ����� �� ���� Ŭ�����̰� �� ��� 
	 		��ӽ��Ѽ� �� Ŭ������ �ν��Ͻ��� ������ �޾Ƽ� ����� ���� ����.
	 		�� Ŭ������ ��ü�� ����Ϸ��� 
	 		�Ҽ� �Լ� �� �Ӽ��� static �̸鼭 ��ȯ���� Pattern �� �Լ��� ����ϸ� �ȴ�.
	 		
	 		�׷� �Լ��� compile() �� �ִ�.
	 */
		
		Pattern p = Pattern.compile("01[0-9]-[0-9]{4}-[0-9]{4}");
	/*
	 	2.	���Խ� ������ �´��� �˻�
	 		������ �˻��ϴ� �Լ��� 
	 			matcher()
	 		�˻� ����� matcher() Ŭ������ ����� ���� ��� ������ ��� ��ȯ�ϵ��� �Ǿ��ִ�.
	 */
		
//		���Խ� �˻��� �޴� ���� 
		Matcher m = p.matcher(phone);
//		Matcher ��ü���� �˻����� ������ ���Ǿ��ִ�.
//		�˻� ����� �˷��ִ� �Լ��� �����ϴµ� 
//		Matcher Ŭ������ ��� �� matches() �Լ��̴�.
		boolean bool = m.matches();
		if(bool) {
			System.out.println("�ùٸ� �޴�����ȣ �Դϴ�.");
		} else {
			System.out.println("�ùٸ� �޴�����ȣ�� �ƴմϴ�.");
		}
		/*
		 	����]
		 		���Խ� �˻� ���]
		 			1.	���Խ� ������ Pattern ��ü�� �����.
		 				Pattern p = Pattern.compile("���Խ�����");
		 			2.	���ڿ��� ���Ͽ� �´��� �˻��Ѵ�.
		 				Matcher m = p.matcher("�˻��ҵ�����");
		 			3.	�˻����� ������ ����Ѵ�.
		 				boolean bool = m.matches();
		 */
		
		String id = "winchae1";
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test01();
	}

}
