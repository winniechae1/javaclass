package day05.ex;

/*
 	�ζ� �Ѱ����� ��������.
 	
 	�ζ� ������ 
 		1 ~ 45 ������ ���� �� 6���� �ߺ��� ���� �ʰ� �����ؼ� ���������. 
 		
 */
public class Lotto01 {

	public static void main(String[] args) {
		
		String lotto = "";
		
		for(int i = 0; i < 6; i++) {
			int num = (int)(Math.random() * 45 + 1);
			
			lotto = lotto + " " + num; 
		}
		System.out.println("�ζ� ��ȣ : " + lotto);
	}

}
