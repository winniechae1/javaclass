package day02;
/*
  문제4]
	친구의 이름, 나이, 신장, 전화번호를 입력받아서 
	출력해주는 프로그램을 작성하세요.
 */
import java.util.*;
public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("친구의 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("친구의 나이 : ");
		int age = sc.nextInt();
		
		System.out.print("친구의 신장 : ");
		double height = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("친구의 전화번호 : ");
		String num = sc.nextLine();
		
		System.out.print("친구의 이름은 " + name + "나이는" + age + "신장은" + height + "전화번호" + num + "이다.");
		
		
		
		/*
		   String name, tell;
		   
		   int age;
		   double height;
		   System.out.print("이름 : ");
		   name = sc.nextLine();
		   
		   System.out.print("나이 : ");
		   age = sc.nextInt();
		   
		   System.out.print("신장 : ");
		   height = sc.nextDouble();
		   // 이 경우는 강제로 메모리에 남아있는 리턴키의 데이터를 뽑아낸다. 
		    sc.nextLine();
		    
		   System.out.print("전화번호 : ");
		   tell = sc.nextLine();
		 */

	}

}
