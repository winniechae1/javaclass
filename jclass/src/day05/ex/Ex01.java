package day05.ex;
/*
 	����1] 
 		�����ϰ� ���ĺ��� 10���� ���� 
 		�Ź� ���ٿ��� �ܾ ���� ����ϼ���.
 */
public class Ex01 {

	public static void main(String[] args) {
		
		String word = "";
		/*
		 	q	- "" + q
		 	w	- "" + q + w
		 	t	- "" + q + w + t
		 	r	- "" + q + w + t + r
		 */
		for(int i = 0; i<10; i++) {
			char ch = (char)(Math.random() * ('z'-'a' + 1) + 'a');
			
			// 'a' + 'a' = "aa"  -- X
			
			// �ܾ��� �����̱� 
			word = word + ch;
			System.out.println(word);
		}
		System.out.println(); // ����] println() �Լ��� �����͸� �Է����� �ʴ� ���� �ٹٲ��� �Ѵ�. 
		System.out.println("��� : " + word);
		/*
		 	����]
		 		��({}) �ȿ��� ������� ������ ���� ���������� ���� ������� �����̴�.
		 		���� ���ۿ��� ������ ������ ����ؾ��� ���� 
		 		�ݵ�� ���ۿ��� ������ ������ְ� 
		 		���ȿ��� ó���� ����� �Ѵ�. 
		 */
	}
}
