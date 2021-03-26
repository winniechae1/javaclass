package day22;
/*
 	MyData에 정보를 채워서 파일로 저장해보자
 */
import java.io.*;
public class ObjectTest01 {

	public ObjectTest01() {
		//	스트림준비
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		try {
			
			fout = new FileOutputStream("src/day22/data/mydata.txt");
			oout = new ObjectOutputStream(fout);
			
			MyData data = new MyData();
			data.setName("박용수");
			data.setName("010-1111-1111");
			data.setName("ys@increpas.com");
			data.setName("서울시 구로구");
			data.setAge(31);
			data.setGen('남');
			data.setHeight(180.0);
			
			oout.writeObject(data);
			/*
			 	이렇게 클래스 전체를 입출력하는 행위를 직렬화라고 한다.
			 */
			System.out.println("저장 성공");
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
