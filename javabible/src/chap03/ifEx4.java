package chap03;

import java.util.*;
public class ifEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ϸ� : ");
		Scanner sc = new Scanner(System.in);
		String fruit = sc.next();
		String res;
		
		if(fruit.equals("grape")) {
			res = "�޴�.";
		}else if(fruit.equals("watermelon")){
			res = "�ÿ��ϴ�. ";
		}else if(fruit.equals("straberry")) {
			res = "���ִ�. ";
		}else
			res = "��Ÿ ";
		System.out.println(res);
	}

}
