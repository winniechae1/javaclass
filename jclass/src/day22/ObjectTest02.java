package day22;


import java.io.*;
import java.util.*;

public class ObjectTest02 {

	public ObjectTest02() {
		HashMap map = new HashMap();
		map.put("name", "�ڿ��");
		map.put("tel", "010-1111-1111");
		map.put("mail", "ys@increpas.com");
		map.put("addr", "����� ���α�");
		map.put("gen", '��');
		map.put("age", 31);
		map.put("height", 	185.0);
		 
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		try {
			//	��Ʈ�� ����� 
			fout = new FileOutputStream("src/day22/data/map.txt");
			oout = new ObjectOutputStream(fout);
			
			oout.writeObject(map);
			System.out.println("���� ���� ����");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new ObjectTest02();
	}

}
