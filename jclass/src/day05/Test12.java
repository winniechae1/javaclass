package day05;

public class Test12 {

	public static void main(String[] args) {
		// �������� ����ϴ� �� 5���� �ǳʶٰ� �ϼ���.
		
		for(int dan=2; dan<10; dan++) {
			if(dan == 5) {
				continue;
			}
			System.out.println("***" + dan + " �� ***");
			for(int gop=1; gop<10; gop++) {
				
				System.out.println(dan + " x " + gop + " = " + (dan * gop));
				}
			 System.out.println("");
		}

	}

}
