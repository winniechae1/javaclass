package chap08;
/*
 	try-catch �������� �帧 
 	[����8-4]
 */
public class ExceptionEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {	// ���ܰ� �߻����� �ʾƼ� catch ���� �ǳʶ�
			System.out.println(5);
		}
		System.out.println(6);		
	}

}
