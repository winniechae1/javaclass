package chap04;

public class FlowEx24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 11;
		
		System.out.println("��, ���� ī��Ʈ�ٿ��� �����մϴ�.");
		while(i--!=0) {
			System.out.println(i);
			for(int j = 0; j < 2_000_000_000; j++) {
				;
			}
		}
		System.out.println("GAME OVER");
	}

}
