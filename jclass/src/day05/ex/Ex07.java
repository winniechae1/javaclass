package day05.ex;
/*
	/*
	문제 7 ]
		두 사람이 등산을 하는데
		한사람은 아래에서 정상으로 올라가기 시작했고
		나머지 사람은 산 정상에서 아래로 하산하기 시작했다.
		
		산의 높이가 7564m라고 하고
		오르는 사람의 속도는 0.54m/s
		하산하는 사람의 속도는 1.07m/s
		라고 한다면
		두사람이 만나는 시점은 몇초 후에 만나게 되는지 
		출력해주는 프로그램을 작성하세요.
		
		반복문으로 처리하세요.
		
		힌트)
			초는 정수로 증가한다.
			따라서 정확하게 만나지는 시점은 구할 수 없을 수도 있다.
			따라서 해결방법은
			 올라가는 사람의 위치가 내려가는 사람의 위치보다 높은 시점이 될 수 있다. 
 */
public class Ex07{
	public static void main (String[] args) {
		
		int high = 7564;
		double upv = 0.54;
		double downv = 1.07;
		double sec1 = (high / upv);
		double sec2 = (high / downv);
		
		for(sec1=1; true; sec1++) {
			if (sec1 == sec2) {
				
				break;
			}
			System.out.println("두 사람은" + sec1 + "초에 만난다");
		}
		
	}
}


