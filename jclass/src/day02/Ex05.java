package day02;
/*
 	����5]
 		54232�� ���� ���� ���θ� ����ϴ�.
 		�������� �����Ϸ��� �Ѵ�. 
 		
 		�츮���� ȭ�� �������� �� ������ ��� �ʿ����� ����ؼ� ����ϼ���.
 		��, ūȭ�� ���� ���ҵǰ� ���� �ݾ����� ����ȭ�� �����մϴ�. 
 		
 		ȭ����� 
 		10000
 		1000
 		100
 		10
 		1
 */
public class Ex05 {

	public static void main(String[] args) {
		
		int money = 54232;
		
		int sulplus = money % 10000;
		
		System.out.println("���ұݾ� : " + money);
		System.out.println("10000�� ���� : " + money/10000);
		System.out.println("1000���� ���� : " + sulplus/1000);
		System.out.println("100���� ���� : " + (sulplus%1000)/100);
		System.out.println("10���� ���� : " + (sulplus%100)/10);
		System.out.println("1���� ���� : " + (sulplus%10));
		
		/*
		 	int man, chun, baek, ten, il, money, tmoney;
		 	money = 54232;
		 	
		 	tmoney = money;
		 	
		 	man = tmoney / 10000;
		 	
		 	tmoney %= 10000; >> tmoney = tmoney % 10000;
		 	
		 	chun = tmoney/1000;
		 	tmoney %= 1000;
		 	
		 	baek = tmoney / 100;
		 	tmoney %= 100;
		 	
		 	ten = tmoney / 10;
		 	
		 	il = tmoney % 10;
		 */
		

	}

}
