package chap04;
// 3, 6, 9 가 포함되어 있으면 포함된 개수만큼 박수를 치는 369 게임이다.
public class FlowEx29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100; i++) {
			System.out.printf("i=%d",i);
			
			int tmp = i;
			
			do {
				if(tmp%10%3==0 && tmp%10!=0) {
					System.out.print("짝");
				} 
			} while ((tmp/=10) != 0);
			System.out.println();
		}
	}

}
