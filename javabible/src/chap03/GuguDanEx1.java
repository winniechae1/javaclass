package chap03;
import java.util.*;
public class GuguDanEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�μ� �Է� : ");
		int dan = sc.nextInt();
		
		System.out.println(dan + "��");
		System.out.println("----------------");
		
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " x " + i + " = " + (dan * i));
		}
	}

}
