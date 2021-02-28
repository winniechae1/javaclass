package chapter5;
//	거스름돈 몇 개의 동전으로 지불할 수 있는지 계산하는 문제 
public class E5_6 {

	public static void main(String[] args) {
		int[] coinUnit = { 500, 100, 50, 10 };
		
		int money = 2680;
		System.out.println("money = " + money);
		
		for(int i = 0; i < coinUnit.length; i++) {
			int tmp = money / coinUnit[i];
			System.out.println(coinUnit[i] + " : " + tmp);
			money = money - tmp * coinUnit[i];
		}
		System.out.println();
	}

}
