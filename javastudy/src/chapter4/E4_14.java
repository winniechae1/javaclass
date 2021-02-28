package chapter4;
/*
 	숫자 맞추기 게임  1과 100사이의 값을 반족적으로 입력해서 
 	컴퓨터가 생각한 값을 맞추면 게임이 끝난다.
 */
import java.util.*;
public class E4_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			int input = sc.nextInt();
			
			int comp = (int)(Math.random() * 100 + 1); 
			count++;
			if(input == comp) {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "입니다.");
				break;
			}else if(comp > input) {
				System.out.println("더 큰 수를 입력하세요.");
			}else{
				System.out.println("더 작은수를 입력하세요.");
				
			}
		}
		
	}

}
