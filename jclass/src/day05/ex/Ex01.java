package day05.ex;
/*
 	문제1] 
 		랜덤하게 알파벳을 10개를 만들어서 
 		매번 덧붙여서 단어를 만들어서 출력하세요.
 */
public class Ex01 {

	public static void main(String[] args) {
		
		String word = "";
		/*
		 	q	- "" + q
		 	w	- "" + q + w
		 	t	- "" + q + w + t
		 	r	- "" + q + w + t + r
		 */
		for(int i = 0; i<10; i++) {
			char ch = (char)(Math.random() * ('z'-'a' + 1) + 'a');
			
			// 'a' + 'a' = "aa"  -- X
			
			// 단어의 덧붙이기 
			word = word + ch;
			System.out.println(word);
		}
		System.out.println(); // 참고] println() 함수는 데이터를 입력하지 않는 경우는 줄바꿈을 한다. 
		System.out.println("결과 : " + word);
		/*
		 	참고]
		 		블럭({}) 안에서 만들어진 변수는 블럭을 빠져나가는 순간 사라지는 변수이다.
		 		따라서 블럭밖에서 블럭안의 내용을 사용해야할 경우는 
		 		반드시 블럭밖에서 변수를 만들어주고 
		 		블럭안에서 처리를 해줘야 한다. 
		 */
	}
}
