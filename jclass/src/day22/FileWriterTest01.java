package day22;
/*
 	char ������ ���Ͽ� �����͸� �����ϴ� ���α׷��� �ۼ��ϼ���..
 */
import java.io.FileWriter;
public class FileWriterTest01 {

	public FileWriterTest01() {
		//	���Ͽ� ������ ��Ʈ�� �غ�
		FileWriter fw = null;
		
		try {
			//	��Ʈ�� �����
			fw = new FileWriter("src/day22/data/fwTest.txt");
			/*
			//	�� ����(2byte)�� �����غ���.
			char ch = '��';
			fw.write(ch);
			*/
			/*
			//	�������ڸ� �����غ���.
			String str = "char ������ ���Ͽ� �����͸� �����ϴ� ���α׷��� �ۼ��غ���.";
			//	2-1 ���ڹ迭�� ó���ϴ� ���
			char[] buff = str.toCharArray();	//	���ڿ��� ���� �迭�� ��ȯ���ִ� �Լ�
			fw.write(buff);
			*/
			
			//	2-2 ���ڿ��� �ٷ� ó���ϴ� ���
			String str = "char ������ ���Ͽ� �����͸� �����ϴ� ���α׷��� �ۼ��غ���.";
			str = str + " : ���ڿ��� ó���ϴ� ��� ";

			

			
			fw.write(str);
			System.out.println("���� ���� �Ϸ�");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new FileWriterTest01();
	}

}
