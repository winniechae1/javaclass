package day18;
/*
 	Ư�� ����Ʈ �ּҸ� �Է��� �� : / . �� �߽����� �и��ؼ� ó���غ���.
 */
import java.util.*;
public class Test05 {

	public Test05() {
		String url = "http://www.increpas.com:8080/ex/example.tst";
		StringTokenizer token = new StringTokenizer(url, ":/.", true);
		/*
		 	����]
		 		���� ���ڿ��� ������ �Է��ϴ��� �� �� �ϳ��� �����ϸ� ��ū �и��� �ȴ�.
		 */
		int count = token.countTokens();
		System.out.println(count);
		/*
		for(int i = 0; i < count; i++) {
			String tmp = token.nextToken();
			System.out.print(tmp + " | ");
		}
		*/
		while(token.hasMoreTokens()) {
			System.out.print(token.nextToken() +"");
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}
