package day10;

import java.util.Arrays;

/*
	���� 5���� ����� �迭�� ����� 
	�� �迭�� ������ ������ �߻����Ѽ� ä���ִ� ����� �Լ��� �ۼ��ؼ� �����ϼ���.
	�迭�� ������ ����ϼ���.
*/
public class T04 {
	
	int[] num = new int[5];
	
	public T04() {
		setNum();
		System.out.println(Arrays.toString(num));
	}
	public static void main(String[] args) {
		new T04();
	}
	
	void setNum() {
		for(int i = 0; i < num.length; i++) {
			int no = (int)(Math.random() * 9 + 1);
			num[i] = no;
		}
	}

}
