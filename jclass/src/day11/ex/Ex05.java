package day11.ex;
/*
 	문제5]
 		원의 정보를 5개를 기억할 배열을 만들어서 
 		정보를 출력해주는 프로그램을 작성하세요.
 		
 		멤버처리는 문제 3과 동일하게 하세요.
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
