package day08.ex;
/*
 	5���� ģ���� ������ ����� �迭�� �����
ģ���� �̸��� �Է��ϸ� ������ ������ִ� ���α׷��� �ۼ��ϼ���.
������ �̸�, ���̵�, �̸���, ��ȭ��ȣ, ����
�� �����ϼ���.
 */
import java.util.*;
public class Extra01 {
	public static void main(String[] args) {
		
		
		
		String[][] frd = {{"¯��", "one" , "one@", "111", "��"},
				          {"�ͱ�", "two" ,"two@","222","��"},
				          {"����","three","three@","333","��"},
				          {"ö��","four","four@","444","��"},
				          {"���","five", "five@", "555","��"}};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		
		for(int i = 0; i < frd.length; i++) {
				if(name.equals(frd[i][0])) {
					System.out.println(Arrays.toString(frd[i]));
			}
		}
		
	}
}
