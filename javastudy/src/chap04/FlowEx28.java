package chap04;

import java.util.Scanner;

// Math.random() �� �̿��ؼ� 1�� 100������ ������ ���� ������ �����ϰ� �� ���� ���⶧���� �ݺ��ϴ� ����
public class FlowEx28 {

	public static void main(String[] args) {
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ���.>");
			
			String tmp = sc.nextLine();
			input = Integer.parseInt(tmp);
			
			if (input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
			} else if(input < answer){
				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
			} 
		} while (input != answer);
		System.out.println("�����Դϴ�.");
	}

}
