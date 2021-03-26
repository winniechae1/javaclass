package day22;

/*
 	ObjectTest01���� ������ ���� MyData�� �о ������ ���� ����غ���.
 */
import java.io.*;
public class ObjectInputTest01 {
  
	public ObjectInputTest01() {
		//	��Ʈ�� �غ�
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		try {
			//	��Ʈ�� �����
			fin = new FileInputStream("src/day22/data/mydata.txt");
			oin = new ObjectInputStream(fin);
			
			MyData data = (MyData) oin.readObject();
			System.out.println(data);
			
			//	���� �ϳ��� ����غ���.
			System.out.println("name : " + data.getName());
			System.out.println("tel  : " + data.getTel());
			System.out.println("mail : " + data.getMail());
			System.out.println("addr : " + data.getAddr());
			System.out.println("age  : " + data.getAge());
			System.out.println("gen  : " + data.getGen());
			System.out.println("height  : " + data.getHeight());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
				fin.close();
			} catch (Exception e) { }
		}
	}

	public static void main(String[] args) {
		new ObjectInputTest01();
	}

}

//