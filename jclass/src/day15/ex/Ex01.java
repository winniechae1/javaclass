package day15.ex;

import static java.lang.Math.random;

public class Ex01 {

	public Ex01() {
		int no = (int)(Math.random() * 11);
		Figure f = null;
		
		if(no % 2 == 0) {
			f = new Nemo((int)(random() * 10)+ 1,(int)(random() * 10)+ 1);
		} else if (no % 2 == 1) {
			f = new Semo((int)(random() * 10)+ 1,(int)(random() * 10)+ 1);
		} else  {
			f = new Won((int)(random() * 10) + 1);
		}
		System.out.println("no : " + no);
	
		f.toPrint();

	}
	public static void main(String[] args) {
		new Ex01();

	}

}
