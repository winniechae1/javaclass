package day05_run;

/*
	do ~ while �ݺ����� �̿��ؼ�
	������ 7���� ����ϼ���.
 */
public class T03 {
	public static void main (String[] args) {
		int dan = 7;
		int gop = 1;
		do {
			System.out.println( dan + " x " + gop + " = " + (dan * gop));
			gop++;
		}while(gop<10);
	}

}
