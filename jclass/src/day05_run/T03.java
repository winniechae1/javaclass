package day05_run;

/*
	do ~ while 반복문을 이용해서
	구구단 7단을 출력하세요.
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
