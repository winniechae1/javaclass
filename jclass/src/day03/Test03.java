package day03;

/*
 	����]
 		������ �Է¹޾Ƽ� 
 		¦���̸� "¦���Դϴ�." 
 		Ȧ���̸� "Ȧ���Դϴ�."
 		0�̸� "0�Դϴ�."
 */
import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String result = (num == 0) ? "0�Դϴ�." : 
							(( num % 2 == 0 ) ? ("¦���Դϴ�.") : ("Ȧ���Դϴ�." ));
		String result1 = (num % 2 == 0) ? ((num == 0) ? "0" : "¦��" ) : "Ȧ�� " ;
		System.out.println(num + " ��" + result);
		System.out.println("�Է¹��� �� " + num + " ��" + result);
		
		
	}

}
