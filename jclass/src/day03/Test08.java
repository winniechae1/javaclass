package day03;

/*
 	'a' ~ 'z' �� �����ϰ� �߻����Ѽ� ����ϼ���.
 	
 	����]
 		���ĺ��� �ƽ�Ű�ڵ尪�� �̿��ؼ� ����Ѵ�.
 */
public class Test08 {

	public static void main(String[] args) {
		int lo = 'a';
		int hi = 'z';
		
		char ch = (char)(Math.random() * (hi - lo + 1) + lo);
		System.out.println("'a' ~ 'z' ������ ������ ���� : " + ch);

	}

}
