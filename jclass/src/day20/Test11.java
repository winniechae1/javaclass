package day20;

/*
 	Properties�� Map �����͸� ����ϴٰ� ���Ϸ� �����غ���. 
 */
import java.io.*;
import java.util.*;
public class Test11 {

	public Test11() {
		Properties prop = new Properties();
		//	Properties�� Map�� �����̹Ƿ� �����͸� �߰��� ���� �ִ�.
		prop.put("name", "��������");
		prop.put("age", "31");
		prop.put("tel", "010-2222-2222");
		prop.put("addr", "���μ�");
		//	�̷��� �۾��� �����ϴٰ� �̰��� ������ �ʿ䰡 ������ �� ���Ͽ� �� �����͸� ��� �����ϰ��� �Ѵٸ�
		
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day20/data/boa.txt");
			//	�� ����� �����͸� ������ ��θ� �غ��� ���̹Ƿ� ���� �����Ͱ� ���޵� ���� �ƴϴ�.
			prop.store(fout, "����� ��� ���� : �ּ����� ���Ե� ����");
			//	�� ����� ���������� ������ �Ǹ� ���Ͽ� ������ ������ �� ���°� �ȴ�.
			System.out.println("*** ����Ϸ� ***");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
 
	public static void main(String[] args) {
		new Test11();
	}

}
