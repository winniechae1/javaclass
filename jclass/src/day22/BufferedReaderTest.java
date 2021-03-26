package day22;

/*
 	day22.data.desert.poem �� �о��.
 	BufferedReader ��Ʈ���� ����ؼ� �о��.
 */

import java.io.*;
public class BufferedReaderTest {

	public BufferedReaderTest() {
		//	��Ʈ�� �غ�
		//	Ÿ�� ��Ʈ�� �غ�
		FileReader fr = null;
		
		//	���ͽ�Ʈ�� �غ� 
		BufferedReader br = null;
		
		try {
			fr = new FileReader("src/day22/data/desert.poem");
			//	Ÿ�ٽ�Ʈ���� �����ϴ� ���ͽ�Ʈ���� �����.
			br = new BufferedReader(fr);
			
			for(;;) {
				String line = br.readLine();	//	 readLine() - �� ���� �д� �Լ� , ("\r\n")�� ������ �� ���������� �о�´�.
				if(line == null) {		//	�о�� �����Ͱ� ���� ���
					break;
				}
				System.out.println(line);	//	println() ��� �� �ٹٲ��� ���ִ� �Լ� 
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e) {}
		}
	}

	public static void main(String[] args) {
		new BufferedReaderTest();

	}

}
