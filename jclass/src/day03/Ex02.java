package day03;
/*
 	���� 2]
 		0 ~ 255 ������ �ƽ�Ű �ڵ尪�� ������ ������ ���ڸ� �߻����Ѽ� 
 		�� ���ڰ� ������ ���� �ƴ��� �Ǻ��ؼ� ����ϼ���.
 */
public class Ex02 {

	public static void main(String[] args) {
		char ch = (char)(Math.random() * 256);
		
		/*
		 	�ƽ�Ű �ڵ尪 �� 
		 	�����ڴ� 
		 	'A' ~ 'Z' ���̿� Ư�����ڵ��� �ְ� 'a' ~ 'z' 
		 */
		
//		String result = (ch < 'A' || ch > 'z' || (ch > 'Z' && ch < 'a'));
		
		String result = ( ch < 'A' || ch > 'z') ? 
								"Ư�������Դϴ�." :
										(( ch > 'Z' && ch < 'a') ? "Ư�������̴�." : "�������̴�."  );
									

	}

}
