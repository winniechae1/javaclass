package day20;
/*
 	ģ�� �̸��� Ű������ �ϰ� �� ģ���� ��ȭ��ȣ�� �����ϴ� Map�� ���� 
 	�����͸� ������ ����غ���.
 */
import java.util.*;

public class Test02 {
	
	Hashtable tab = new Hashtable();
	public Hashtable getTab() {
		return tab;
	}
	public void setTab(Hashtable tab) {
		this.tab = tab;
	}
	public void setTab() {	// Overloading
		tab = new Hashtable();
		tab.put("ȫ�浿", "010=1111-1111");
		tab.put("����", "010=2222-2222");
		tab.put("����", "010=3333-3333");
		tab.put("����", "010=4444-4444");
		tab.put("����", "010=5555-5555");
		tab.put("����", "010=6666-6666");
	}
	public void toPrint() {
		// Map �迭�� key���� �־�� �����͸� ������ �� �����Ƿ� 
		// key���鸸 ��� ��������.
		Set set = tab.keySet();
		// Iterator�� ��ȯ 
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			//	key�� ��������
			String key = (String) itor.next();
			//	tab���� Ű���� �ش��ϴ� ������ ��������
			String val = (String) tab.get(key);
			System.out.println(key + " | " + val);
		}
	}
	// keys() �Լ� �̿��ؼ� ������ִ� �Լ� 
	public void toPrint(Hashtable t) {
		// key������ ����
		Enumeration en = t.keys();
		// �ϳ��� ������ ���
		while(en.hasMoreElements()) {
			//	Ű ������
			String key = (String) en.nextElement();
			//	value ������
			String val = (String) t.get(key);
			//	����ϰ� 
			System.out.println(key + " | " + val);
		}
	}
	public Test02() {
		setTab();	// tab �ʱ�ȭ 
		// ������ ���
		toPrint();
		System.out.println();
		// keys()�� ó�� �� ���
		toPrint(tab);
	}
	
	public static void main(String[] args) {
		new Test02();
	}

}
