package day07.ex;
/*
 	int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1}
	을 준비하고

	79456원을 준비된 화폐단위로 계산할 때 각각의 화폐단위가
	몇개씩 필요한지를 출력하는 프로그램을 작성하세요.
 */
public class Ex03 {

	public static void main(String[] args) {
		
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		int money = 79456;
		int unit [] = new int[coin.length];
		for(int i = 0; i < coin.length; i++) {
		   if(coin[i] <= money) {
			   unit[i] = money/coin[i];
			   money = money % coin[i];
		   }
		   System.out.println( coin[i] + "단위의 개수는" + unit[i] + " 개 입니다.");
		}
		
	}

}
