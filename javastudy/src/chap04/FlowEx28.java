package chap04;

import java.util.Scanner;

// Math.random() 을 이용해서 1과 100사이의 임의의 수를 변수에 저장하고 이 값을 맞출때까지 반복하는 예제
public class FlowEx28 {

	public static void main(String[] args) {
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			
			String tmp = sc.nextLine();
			input = Integer.parseInt(tmp);
			
			if (input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if(input < answer){
				System.out.println("더 큰 수로 다시 시도해보세요.");
			} 
		} while (input != answer);
		System.out.println("정답입니다.");
	}

}
