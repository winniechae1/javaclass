package day20;
/*
 	ģ���� �̸��� Ű������ �̸����� �����ͷ� �ϴ� ���� ���� 
 	ģ�� 5���� �����͸� �Է��ϰ� �Ѹ� ������ ����غ���.
 	entrySet() ����ؼ� ó���ϼ���.
 */
import java.util.*;

public class Test04 {
	private HashMap map;
	
	public Test04() {
		setData();
		printMap();
	}
	//	map �ʱ�ȭ���ִ� �Լ�
	public void setData() {
		// �������� �ʱ�ȭ
		map = new HashMap();
		
		//	������ �߰�
		map.put("�ڿ��","yong@increpas.com");
		map.put("������","hyun@increpas.com");
		map.put("������","shin@increpas.com");
		map.put("���汹","gook@increpas.com");
		map.put("�����","kieun@increpas.com");
	}
	//	map�� ������ ������ִ� �Լ�
	public void printMap() {
		//	key�� value�� Map.Entry�� �Է��ϰ� �װ͵��� Set�� ��Ƽ� ��ȯ�޴´�.
		Set set = map.entrySet();
		
		//	ArrayList�� ��ȯ�ؼ� 
		ArrayList list = new ArrayList(set);
		for(int i = 0; i < list.size(); i++) {
			Object o = list.get(i);
			Map.Entry ent = (Map.Entry) o;
			String key = (String) ent.getKey();
			String value = (String) ent.getValue();
			
			// ���
			System.out.println(key + " - " + value);
		}
	}
	public HashMap getMap() {
		return map;
	}

	public void setMap(HashMap map) {
		this.map = map;
	}


	public static void main(String[] args) {
		new Test04();
	}

}
