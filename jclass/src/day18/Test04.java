package day18;
/*
 	���ڿ��� ������ �������� �ܾ ����� ����غ���.
 */
import java.util.*;

public class Test04 {

	public Test04() {
		// TODO Auto-generated constructor stub
		String str = "�״� ������ �ϴ��� �췯�� ���� �β������� ���⸦";
		/*
		 	�� ���ڿ��� ������ �������� �и��Ϸ��� 
		 	StringTokenizer �� �̿��ؼ� ó���ϸ� �����ϰ� ó���� �� �ִ�.
		 */
		StringTokenizer token = new StringTokenizer(str);
		/*
		 	�̷��� ���ڿ��� �Է��ϸ鼭 ��ü�� ����� ���ڿ� �� ������ �߽����� 
		 	�ܾ���� �߶� ����ϰ� �ȴ�. �� ��� �и��� �ܾ���� ���������� 
		 	�ӽ� ���۸޸𸮿� ���ȴ�.
		 	
		 */
		int count = token.countTokens();
		System.out.println("�߷��� ���� : " + count);
		/*
		 	���� ���ڿ��� ������ �������� 7���� ������ �ִ�.
		 	������ �ܾ ����Ϸ��� �ݺ��ؼ� ������ �ϴµ� 
		 	
		 */
		String[] words = new String[count];
		for(int i = 0; i < count; i++) {
			String tmp = (String)token.nextElement();
			System.out.println(tmp);
		}
		
		for(String s : words) {
			System.out.print(s + " , ");
		}
		
		/*
		 	�̶� ������ �ܾ�� �ӽ� �޸𸮿��� ������ ���� �����ȴ�.
		 	���� �ʿ��ϸ� �迭 ���� �̿��ؼ� �ٽ� ������ �� ����ؾ� �Ѵ�.
		 */
		/*
		 	������ �ܾ��� ������ ���� �Ǵ� ��� 
		 	�� ��� �� �ܾ���� �迭�� 
		 */
		ArrayList<String> list = new ArrayList<String>();
		while(token.hasMoreTokens()) {
			// hasMoreTokens() : �ӽø޸𸮿� ���� �����Ͱ� �����ϴ��� ���� �Լ� 
			String tmp = token.nextToken();
			list.add(tmp);
			System.out.println(token.nextToken());
		}
		
		for(String s : list) {
			System.out.println( s + " | ");
		}
//		System.out.println(token.nextToken());
	
	}
	public static void main(String[] args) {
		new Test04();
	}
}
