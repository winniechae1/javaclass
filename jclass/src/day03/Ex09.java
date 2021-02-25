package day03;

/*
 	문제9]
	게시물을 게시판에 출력하는데 하나의 게시판 페이지에는 게시물을 15개를 출력할 수 있다.
	게시물의 개수를 랜덤하게 발생시킨 후 몇개의 페이지가 필요한지 계산해서 출력해주는 
	프로그램을 작성하세요.
 */
public class Ex09 {
 
	public static void main(String[] args) {
		int count = (int)(Math.random() * (100 - 0 + 1) + 0 );
		int page;
		
		int result = count / 15; 
		 
		if (result == 0) {
			page = 1;
		}
		else if ((result % 15) != 0){ 
			page = result + 1;
		}
		else {
			page = result;
		}
		System.out.println("게시물 개수 : " + count);
		System.out.println("페이지 수 : " + page); 
	}

}
