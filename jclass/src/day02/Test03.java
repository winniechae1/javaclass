package day02;
/*
 	����3]
	�ﰢ���� �غ��� ���̸� ������ �Է¹޾Ƽ� 
	���̸� ������ִ� ���α׷��� �ۼ��ϼ���.
	 
 */
import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ﰢ���� �غ� : ");
		int base = sc.nextInt();
		
		System.out.print("�ﰢ���� ���� : ");
		int height = sc.nextInt();
		
		double triarea = base * height * 0.5;
		/*
		 	double area = width * height / 2;
		 	������� �̷��� ����ϸ� 
		 	�������� ������ ������� ���̰� �Ҽ��� ���ϴ� ������ �����Ͱ� 
		 	���������. ���� �����ʹ� �Ǽ����� �׻� �����Ƿ� �Ǽ��� ���� �� �ְ� 
		 	���� ������ �߻����� �ʴ´�. ������ ���ϴ� ������� �������� �� �ִ�.
		 */
		
		System.out.println("�ﰢ���� �غ� " + base + "�ﰢ���� ����" + height + "�� �ﰢ���� ���̴� " + triarea + "�Դϴ�");
		// System.out.printf("%s : %"

	}

}
