package day05.ex;
/*
	���� 5 ]
		�ΰ��� ������ �Է¹޾Ƽ�
		�μ��� �ִ� ������� ������ִ� ���α׷��� �����ϼ���.
		
		���� ]
			�ִ� ����� ]
				�μ��� ���� �� �ִ� ���� ���� ū ��..
				
				�� ]
					6 �� 8�� �ִ� ������� 2�̴�.
					6 �� 9�� �ִ������� 3�̴�.
*/
import java.util.*;
public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� :");
		int num1 = sc.nextInt();
		
		System.out.print("������ �Է��ϼ��� :");
		int num2 = sc.nextInt();
		
		sc.close();
		
		/*
	//	 	�� ���� ū���� ã�´�.
		 	int max = (num1>num2)?num1:num2;
		 	int result = 0;
		 	for(int i = max; true; i++){
		 		if ( i % num1 == 0 && i % num2 == 0){
		 			
		 			result = i;
		 			break;
		 		}
		 	}
		 	System.out.println("�Է��� �� ��" + num1 + " ��" + num2 + "�� �ּҰ������ " + result + "�Դϴ�.");
		 */
		int i = 1;
		int max=0;
		while(i < num1 && i < num2) {
			if(num1%i ==0 && num2%i ==0) {
				max = i;
			}
					i++;
			}
		System.out.println("�ִ�������" + max);

}
}

