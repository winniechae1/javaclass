package day22;
/*
 	MyData�� ������ ä���� ���Ϸ� �����غ���
 */
import java.io.*;
public class ObjectTest01 {

	public ObjectTest01() {
		//	��Ʈ���غ�
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		try {
			
			fout = new FileOutputStream("src/day22/data/mydata.txt");
			oout = new ObjectOutputStream(fout);
			
			MyData data = new MyData();
			data.setName("�ڿ��");
			data.setName("010-1111-1111");
			data.setName("ys@increpas.com");
			data.setName("����� ���α�");
			data.setAge(31);
			data.setGen('��');
			data.setHeight(180.0);
			
			oout.writeObject(data);
			/*
			 	�̷��� Ŭ���� ��ü�� ������ϴ� ������ ����ȭ��� �Ѵ�.
			 */
			System.out.println("���� ����");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
				fout.close();
			} catch(Exception e) {}
			
		}
	}

	public static void main(String[] args) {
		new ObjectTest01();
	}

}
