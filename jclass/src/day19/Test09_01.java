package day19;

import java.util.*;
public class Test09_01 {

	public Test09_01() {
		ArrayList crew = new ArrayList();
		
		//	Test09�� �ִ� �����͸� �����ͼ� 
		//	crew �� �Ѹ� �����͸� ä������ 
		//	�̸�, ����, ����, ���� ������ 
		
		//	Test09 ��ü�� ������ �׾��� ����� ����� �� �ִ�.
		Test09 data = new Test09();
		
		//	�ϳ��� ������ crew �� ä������ 
		for(int i = 0; i < data.names.size(); i++) {
			ArrayList person = new ArrayList();
			person.add(data.names.get(i));
			person.add(data.ages.get(i));
			person.add(data.gens.get(i));
			person.add(data.kees.get(i));
			
			crew.add(person);
		}
		//	���
		for(Object o : crew) {
			ArrayList tmp = (ArrayList) o;
			System.out.println(tmp);
		}
	}

	public static void main(String[] args) {
		new Test09_01();
	}

}
