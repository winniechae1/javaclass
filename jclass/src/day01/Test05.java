package day01;


/**
 * 
 * 
 * 
 * 
 * 
 * @author kwakchaewon
 * @since	2021.02.15
 * @version	v.1.0
 * 
 * 		�� Ŭ������ ���� ���� �ǽ��� Ŭ�����̴�.
 */
public class Test05 {
	public static void main(String[] args) {
		/*
		 	{ } : ����, ���̶�� �θ���.
		 	
		 	; : �ϳ��� ����� �������� �˷��ִ� ��ȣ 
		 		��ū�̶�� �̾߱��Ѵ�. 
		 	
		 */
		// �Լ� ���ο� ������ ���� �ȴ�. 
		
		String str1;	//���ÿ� str1�̶�� ��Ī���� ���ڿ��� ����� ������ �Ҵ�ްڽ��ϴ�.
		str1 = "hong gil dong";
		// �غ�� str1 ������ ������ "hong gil dong"�� �ּҸ� ����ϰڽ��ϴ�.
		
		// ������ ���� 
		int num;
		num = 256;
		
		// ���� ���� 
		char ch01 = '@';
		
		System.out.println("str1 : " + str1);
		System.out.println("num : " + num);
		System.out.println("ch01 : " + ch01);
		/*
			����]
				
				���ڿ� + �ٸ�Ÿ�Ե����� >>	���ڿ� 
				
				���� + (*, /, -, %) �Ǽ�  >>	 �Ǽ� 
				
				<< �Ǽ��� ũ�Ⱑ �� ũ�� �����̴�. 
				
			��� ������ ����� Ÿ����  ū Ÿ������ ���������. 
		*/
		
		int rad = 5;
		double area = rad * rad * 3.14;
		
		System.out.println("�������� " + rad + " �� ���� ���̴�" + area + "�Դϴ�.");
	}
	

}
