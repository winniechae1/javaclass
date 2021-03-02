package day11.ex;
/*
 	문제3]
 		삼각형 5개 기억할 배열을 만들고 
 		각 삼각형의 정보를 출력하세요.
 		단, 삼각형의 가로 세로 세팅은 함수로 각각 처리하세요.
 		(==> 생성자에서 처리하지 않도록 하세요. 출력함수도 삼각형 클래스에서 
 			정의해놓고 함수를 호출해서 처리하도록 하세요.)
 */
public class Ex03 {
	
	public Ex03() {
		Tri[] tri = new Tri[5];
		
		for(int i = 0; i < tri.length; i++) {
			tri[i] = new Tri();
		}
		 
		for(int i = 0; i < tri.length; i++) {
			tri[i].garo();
			tri[i].sero();
		}
		for(Tri t : tri){
			t.toPrint();
		}
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}
