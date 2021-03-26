package day22;
/*
 	���� �������� ���� fwTest.txt ������ �����ؼ� 
 	desert.poem ������ ������.
 */
import java.io.*;
public class TextFileCopy {

	public TextFileCopy() {
		//	��Ʈ���� �غ��Ѵ�.
		//	���縦 �ؾ��ϹǷ� �д� ��Ʈ���� ���� ��Ʈ�� �ΰ��� �غ�Ǿ�� �Ѵ�.
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("src/day22/data/fwTest.txt");
			fw = new FileWriter("src/day22/data/desert.poem");
			
			//	��� ����Ǿ�� ���� �𸣹Ƿ� �ݺ������� ó���Ѵ�.
			while(true) {
				//	����� ���ʿ��� �о ���ʿ��� ���� ����� �����ϸ� �ȴ�.
				//	���� ����� �ٷ� �����ϴ� ���·� �ۼ��غ���.
				char[] buff = new char[1024];
				//	������ �а� 
				int len = fr.read(buff);
				if(len == -1) {
					break;
				}
				fw.write(buff,0,len);
			}
			
		} catch(Exception e) {
			System.out.println("���� ���� ����");
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				fr.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new TextFileCopy();
	}

}
