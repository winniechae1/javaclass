package day20;

/*
 	ArrayList�� ���ڿ� �����͸� �Է��ϵ��� ���ʸ����� �����غ���.
 */
import java.util.*;
public class Test13 {

	public Test13() {
		ArrayList<String> list = new ArrayList<String>();
		//	�� list�� ���ڿ� �����͸� �Էµǵ��� �����Ǿ��ִ�.
		list.add("����");
		list.add("����");
		list.add("���");
		
		//	�ϳ��� ������ ����غ���
		for(String s : list) {
			// list���� ���ڿ� �����͸� �Էµǵ��� �س����Ƿ� �����͸� ������ �� �����ʹ� �ݵ�� ���ڿ��� ���̴�.
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new Test13();
	}

}
