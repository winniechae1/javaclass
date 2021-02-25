package day05.ex;
/*
 	로또 1게임을 만들어서 출력하세요.
 */
public class Lotto02 {

	public static void main(String[] args) {
		
		String lotto = "";
		int i = 0;
		
		while (i < 6) {
			int num = (int)(Math.random() * 45 + 1);
			
			lotto += " " + num;
			
			i++;
		}
		System.out.println("로또1게임 : " + lotto);

	}

}
