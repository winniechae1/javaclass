package day05;
/*
 	����]
 		���� �Է¹޾Ƽ� 
 		�ش� ���� �������� ������ִ� ���α׷��� �ۼ��ϼ���.
 		
 -----------------------------------------------
 		���� ����ϸ� �ٽ� ���� �Է¹޵��� �ϰ� 
 		0�� �Է��ϸ� ���α׷� ����ǵ��� ���α׷��� �ۼ��ϼ���.
 */
import java.util.*;
public class Test09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("���� �Է��ϼ��� : ");
		int dan = sc.nextInt();
		
		for(int i = 0; i<9; i++) {
			System.out.println(dan + " x " + (i+1) + " = " + (dan * (i+1)));
		}
		}
		
	}


