package day11.ex;
/*
 	����5]
 		���� ������ 5���� ����� �迭�� ���� 
 		������ ������ִ� ���α׷��� �ۼ��ϼ���.
 		
 		���ó���� ���� 3�� �����ϰ� �ϼ���.
 */
public class Ex05 {
	public Ex05() {
		Won[] won = new Won[5];
		
		for(int i = 0; i < won.length; i++) {
			won[i] = new Won();
		}
		for(int i = 0; i < won.length; i++) {
			won[i].setRad();
			won[i].setAround();
			won[i].setArea();
		}
		for(int i = 0; i < won.length; i++) {
			won[i].toPrint();
		}
		
	}
	public static void main(String[] args) {
		new Ex05();
	}

}
