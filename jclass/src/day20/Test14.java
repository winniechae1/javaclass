package day20;

import java.util.*;
public class Test14 {

	public Test14() {
		HashSet<String> set = new HashSet<String>();
		set.add("����");
		set.add("����");
		set.add("���");
		set.add("����");
		set.add("���");
		set.add("����");
		set.add("�κ�");
		set.add("���");
		set.add("��������");
		
		//	ArrayList�� ��ȯ�ؼ� ������ ������ 
		ArrayList<String> list = new ArrayList<String>(set);
		String name1 = list.get(0);	// ���ʸ����� ���İ� �ȵǱ� ������ �ٽ� ���ʸ��� ������ ����� �Ѵ�.
		System.out.println(name1);
		
		System.out.println();
		//
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			String name = itor.next();
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		new Test14();
	}

}
