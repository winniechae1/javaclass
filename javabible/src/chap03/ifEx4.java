package chap03;

import java.util.*;
public class ifEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("과일명 : ");
		Scanner sc = new Scanner(System.in);
		String fruit = sc.next();
		String res;
		
		if(fruit.equals("grape")) {
			res = "달다.";
		}else if(fruit.equals("watermelon")){
			res = "시원하다. ";
		}else if(fruit.equals("straberry")) {
			res = "맛있다. ";
		}else
			res = "기타 ";
		System.out.println(res);
	}

}
