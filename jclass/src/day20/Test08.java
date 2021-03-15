package day20;
/*
 	
 	5���� ģ���� �̸�, ��ȭ��ȣ, ����, ������ ���� Map���� ����� ����ϰ� 
 	ģ���� �̸��� �Է��ϸ� ģ���� ������ ������ִ� ���α׷��� �ۼ��ϼ���.
 	
 */
import java.util.*;

public class Test08 {
	private ArrayList list;
	public Test08() {
		setFriend();
//		printNames();
		
		getInfo();
	}
	// List �ʱ�ȭ 
	public void setFriend() {
		list = new ArrayList();
		
		HashMap map1 = new HashMap();
		map1.put("�̸�", "�ڿ��");
		map1.put("��ȭ��ȣ", 010-1111-1111);
		map1.put("����", "1991/02/04");
		map1.put("����", "M");
		
		HashMap map2 = new HashMap();
		map2.put("�̸�", "������");
		map2.put("��ȭ��ȣ", 010-2222-2222);
		map2.put("����", "1989/04/22");
		map2.put("����", "M");
		
		HashMap map3 = new HashMap();
		map3.put("�̸�", "������");
		map3.put("��ȭ��ȣ", 010-3333-3333);
		map3.put("����", "1989/08/06");
		map3.put("����", "M");
		
		HashMap map4 = new HashMap();
		map4.put("�̸�", "�����");
		map4.put("��ȭ��ȣ", 010-4444-4444);
		map4.put("����", "������");
		map4.put("����", "F");
		
		HashMap map5 = new HashMap();
		map5.put("�̸�", "�ֿ���");
		map5.put("��ȭ��ȣ", 010-5555-5555);
		map5.put("����", "�˾Ƹ��纸����!");
		map5.put("����", "M");
		
		//	����Ʈ�� MAP�� ��´�.
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
	}
	
	//	�̸��� �Է¹޾Ƽ� �ش� ģ���� ������ ������ִ� �Լ� 
	public void getInfo() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			//	��ü ģ�� ����Ʈ ���
			printNames();
			//	�ٹٲ�
			System.out.println();
			
			//	�޼��� ���
			System.out.print("ģ���̸� : ");
			String name = sc.nextLine();
			//	q�� �ԷµǸ� �����Ѵ�.
			if(name.equals("q")) {
				sc.close();
				return;
			}
			for(int i = 0; i < list.size(); i++) {
				Object o = list.get(i);
				HashMap m = (HashMap) o;
				String irum = (String) m.get("�̸�");
				if(name.equals(irum)) {
					System.out.println("\t�̸� : " + m.get("�̸�"));
					System.out.println("\t��ȭ��ȣ : " + m.get("��ȭ��ȣ"));
					System.out.println("\t���� : " + m.get("����"));
					System.out.println("\t���� : " + m.get("����"));
					break;
				}
			}
		}
	}
	//	��� ģ���� �̸��� ������ִ� �Լ�
	public void printNames() {
		for(Object o : list) {
			HashMap m = (HashMap) o;
			String name = (String) m.get("�̸�");
			
		//	���
			System.out.print(name + " | " );
		}
	}
	public static void main(String[] args) {
		new Test08();
	}

	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		this.list = list;
	}

}
