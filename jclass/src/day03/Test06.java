package day03;

// �������� �Է¹޾Ƽ� ���� �ѷ��� ���̸� ������ִ� ���α׷��� �ۼ��ϼ���.
public class Test06 {

	public static void main(String[] args) {	
		/*
		 	Math.random()
		 		>> 0���� ũ�ų� ���� 1���� ���� double Ÿ���� �Ǽ��� ��ȯ���ִ� �Լ� 
		 */
		System.out.println(Math.random());
		
		// 0 ~ 44 ������ ������ ���ڸ� �߻����Ѻ���.
		int no = (int)(Math.random() * (44 - 0 + 1) + 0);
		
		System.out.println("0 ~ 44 ������ ������ ���� : " + no);
	}

}
