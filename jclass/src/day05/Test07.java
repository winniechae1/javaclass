package day05;
/*
 	do ~ while �ݺ����� �̿��ؼ� 
 	������ 7���� ����ϼ���.
 */
public class Test07 {

	public static void main(String[] args) {
		
		// �ʿ��� ���� ����� 
		int dan = 7;
		
		int gop = 1;
		
		do {
			System.out.println(dan + " x " + gop + " = " + (dan*gop));
			gop++;
		} while (gop < 10);
		// while(gop<-10); >> �� ��� ���ǽ��� �����̶� ó�������� �ѹ��� ����ȴ�. 
	}

}
