package day11.ex;
/*
 	���� 4] 
 		�簢�� 7���� ����� �迭�� ����� 
 		������ ����ϴ� ���α׷��� ���弼��.
 		
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
