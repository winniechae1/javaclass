package day20;

/*
	Student Ŭ������ ��ü�� Ű������ �ϰ� ������ avg ���� ������ �ϴ� TreeMap�� ���� 
	�����͸� 5�� �߰��غ���.
 */

import static java.lang.Math.*;
import java.util.*;
public class Test07 {
	private TreeMap map;
	
	public Test07() {
		setData();
		printMap();
	}
	
	// ���� �ʱ�ȭ �Լ�
	public void setData() {
		// �츮�� Ű������ ����� �����ʹ� Student Ÿ���̰�
		// �� Ŭ������ ��Һ񱳰� �ȵǴ� Ŭ�����̴�.
		// ���� TreeMap�� ���鶧 ���ı����� ������� �Ѵ�.
		map = new TreeMap(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// �̶� Object �� Ű������ ����� Student ��ü�� �ǹ��Ѵ�.
				int t1 = ((Student) o1).getTotal();
				int t2 = ((Student) o2).getTotal();
				return t1 - t2;
			}
		});
		
		// Ű������ ����� ������ �����
		Student st1 = new Student("�ڿ��", getNo(), getNo(), getNo(), getNo(), getNo());
		Student st2 = new Student("������", getNo(), getNo(), getNo(), getNo(), getNo());
		Student st3 = new Student("������", getNo(), getNo(), getNo(), getNo(), getNo());
		Student st4 = new Student("���汹", getNo(), getNo(), getNo(), getNo(), getNo());
		Student st5 = new Student("�����", getNo(), getNo(), getNo(), getNo(), getNo());
		
		// ������ �߰��ϰ�
		map.put(st1, st1.getAvg());
		map.put(st2, st2.getAvg());
		map.put(st3, st3.getAvg());
		map.put(st4, st4.getAvg());
		map.put(st5, st5.getAvg());
	}
	
	// map�� ���� ������ִ� �Լ�
	public void printMap() {
		// Ű���� �̾ƿ���
		Set set = map.keySet();
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			Object key = itor.next();
			Object value = map.get(key);
			
			// ���
			System.out.println(key);
			System.out.println(value);
		}
	}
	
	// �����ϰ� ���� ��ȯ���ִ� �Լ�
	public int getNo() {
		return (int)(random()*41 + 60);
	}
	
	public TreeMap getMap() {
		return map;
	}
	public void setMap(TreeMap map) {
		this.map = map;
	}

	public static void main(String[] args) {
		new Test07();
	}

}