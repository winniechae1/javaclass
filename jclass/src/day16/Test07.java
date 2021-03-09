package day16;

public class Test07 {

	public Test07() {
		//	1 ~ 10 사이의 정수를 랜덤 발생 5가 발생하면 강제 예외 발생
		int no = 0;
		
		try {
			while(true) {
				no = (int)(Math.random() * 10 + 1);
				System.out.println("1. no : " + no);
				if( no == 5 ) {
				throw new Exception();
				}
				System.out.println("2. no : " + no);
			}
		} catch(Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		  }
		}

	public static void main(String[] args) {
		new Test07();

	}

}
