package day02;
/*
 	문제5]
 		54232원 으로 제가 원두를 샀습니다.
 		현금으로 지불하려고 한다. 
 		
 		우리나라 화폐 단위별로 각 단위가 몇개가 필요한지 계산해서 출력하세요.
 		단, 큰화폐가 먼저 지불되고 남은 금액으로 작은화폐를 지불합니다. 
 		
 		화폐단위 
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
		
		System.out.println("지불금액 : " + money);
		System.out.println("10000원 개수 : " + money/10000);
		System.out.println("1000원의 개수 : " + sulplus/1000);
		System.out.println("100원의 개수 : " + (sulplus%1000)/100);
		System.out.println("10원의 개수 : " + (sulplus%100)/10);
		System.out.println("1원의 개수 : " + (sulplus%10));
		
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
