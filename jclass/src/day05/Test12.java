package day05;

public class Test12 {

	public static void main(String[] args) {
		// 구구단을 출력하는 데 5단을 건너뛰고 하세요.
		
		for(int dan=2; dan<10; dan++) {
			if(dan == 5) {
				continue;
			}
			System.out.println("***" + dan + " 단 ***");
			for(int gop=1; gop<10; gop++) {
				
				System.out.println(dan + " x " + gop + " = " + (dan * gop));
				}
			 System.out.println("");
		}

	}

}
