package jungsuk1;
/*
 	������ ���� ch�� ������(�빮�� �Ǵ� �ҹ���) �̰ų� ������ ���� 
 	���� b�� ���� true �� �ǵ��� �ϴ� �ڵ��̴�.
 */
public class E3_9 {

	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || ( ch >= 0 && ch <= 9));
		
		System.out.println(b);
	}

}
