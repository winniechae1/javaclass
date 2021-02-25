package day07.ex;
/*
 	int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1}
	�� �غ��ϰ�

	79456���� �غ�� ȭ������� ����� �� ������ ȭ�������
	��� �ʿ������� ����ϴ� ���α׷��� �ۼ��ϼ���.
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
		   System.out.println( coin[i] + "������ ������" + unit[i] + " �� �Դϴ�.");
		}
		
	}

}
