package chap08;
/*
 	try-catch 문에서의 흐름 
 	[예제8-4]
 */
public class ExceptionEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {	// 예외가 발생하지 않아서 catch 구문 건너뜀
			System.out.println(5);
		}
		System.out.println(6);		
	}

}
