package chapter5;
//	�Ž����� �� ���� �������� ������ �� �ִ��� ����ϴ� ���� 
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
