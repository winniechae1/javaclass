package chapter4;

public class E4_4 {

	public static void main(String[] args) {
		int gop = -1;
		int sum = 0;
		int no = 0;
		for(int i = 1; ; i++) {
			gop = gop * -1;
			no = i * gop;
			sum = sum+ no;
			no = i;
			if(sum >= 100) 
				break;
		}
		System.out.print(no +" 까지 계산한 결과가 " + sum + " 으로 처음 100이상을 넘기게 된다.");
	}
	
}
