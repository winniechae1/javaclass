package chapter4;
/*
 	1 + (1+2) + (1+2+3)+(1+2+3+4)+ .....+(1+2+3+....+10)
 	의 결과를 계산하세요.
 */
public class E4_3 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			int tmp = (1+i)*i/2;
			sum += tmp;
		}
		System.out.print(sum);

	}

}
