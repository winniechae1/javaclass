package day04;

/*
 	���ڿ� ���ϴ� ��� 
 	>> ���ڿ��� �ڹ��� �⺻������Ÿ���� �ƴϱ� ������ ���� �񱳳� ��Һ񱳰� 
 		�Ұ����ϴ�. << �����ڸ� ����� �� ���� �����̴�.. 
 		
 		���ڿ��� ���� ����ϱ� ������ �⺻ ������ Ÿ������ ȥ���ϱ� ���쳪
 		����� �⺻ ������ Ÿ���� �ƴϴ�. 
 		
 		���� �����ڸ� ����� ��� �����̳� �� ������ �Ұ����ϴ�. 
 		
 		�׷��� ���ڿ����� ����񱳿����ڷ� ������ ������ �ϴ�. 
 		�̶� ���ϴ� ���� ���ڿ� �����͸� ���ϴ� ���� �ƴϰ� 
 		���ڿ� �����Ͱ� ����� �޸� �ּҸ� ���Ѵ�. 
 		
 		����]
 			���ڿ��� ����� ��� 
 			
		 	���1]
		 		String str1 = "ȫ�浿";
		 			
			���2]
	 			String str2 = new String("ȫ�浿");
	 ���ڿ��� �����͸� ���ϴ� ���]
	 	������1.equals(������2)
	 	
	 *****
	 �߿�]
	 	���ڿ� �����͸� ���� ���� �ݵ�� equals() �Լ��� ����ؼ� ���ؾ��Ѵ�.
	 	
 */
public class Test01 {

	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = new String("ȫ�浿");
		String str3 = "ȫ�浿";
		String str4 = new String("ȫ�浿");
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str2 == str4 : " + (str2 == str4));
		
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
	}

}
