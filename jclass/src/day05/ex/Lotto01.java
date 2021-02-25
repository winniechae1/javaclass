package day05.ex;

/*
 	로또 한게임을 만들어보세요.
 	
 	로또 게임은 
 		1 ~ 45 까지의 숫자 중 6개를 중복이 되지 않게 구성해서 만들어진다. 
 		
 */
public class Lotto01 {

	public static void main(String[] args) {
		
		String lotto = "";
		
		for(int i = 0; i < 6; i++) {
			int num = (int)(Math.random() * 45 + 1);
			
			lotto = lotto + " " + num; 
		}
		System.out.println("로또 번호 : " + lotto);
	}

}
