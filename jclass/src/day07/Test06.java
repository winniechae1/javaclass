package day07;

//���� ����
public class Test06 {

	public static void main(String[] args) {
		int[] no1 = new int[5];
		System.out.println("no �� ù��° ������ : " + no1[0]);
		
		// no1�� �����ؼ� �迭�� �����. 
		int[] no2 = no1;
		System.out.println("no2�� ù��° ������ : " + no2[0]);
		
		// no1 �� ù��° �����͸� ����
		no1[0] = 110;
		System.out.println("no1�� ù��° ������ : " + no1[0]);
		System.out.println("no2�� ù��° ������ : " + no2[0]);
		
		/*
		 	��������� �ּҸ� �����ϰ� �Ǹ� �����ʹ� �����ϰ� �ȴ�.
		 */
	}

}
