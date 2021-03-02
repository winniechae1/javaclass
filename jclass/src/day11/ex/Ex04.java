package day11.ex;
/*
 	문제 4] 
 		사각형 7개를 기억할 배열을 만들고 
 		정보를 출력하는 프로그램을 만드세요.
 		
 */
public class Ex04 {
	public Ex04() {
		Rec[] rec = new Rec[7];
		
		for(int i = 0; i < rec.length; i++) {
			rec[i] = new Rec();
		}
		
		for(int i = 0; i < rec.length; i++) {
			rec[i].setGaro();
			rec[i].setSero();
		}
		
		for(Rec r : rec) {
			r.toPrint();
		}
	}
	public static void main(String[] args) {
		new Ex04();
	}

}
