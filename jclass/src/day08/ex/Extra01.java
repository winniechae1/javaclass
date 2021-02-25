package day08.ex;
/*
 	5명의 친구의 정보를 기억할 배열을 만들고
친구의 이름을 입력하면 정보를 출력해주는 프로그램을 작성하세요.
정보는 이름, 아이디, 이메일, 전화번호, 성별
을 저장하세요.
 */
import java.util.*;
public class Extra01 {
	public static void main(String[] args) {
		
		
		
		String[][] frd = {{"짱구", "one" , "one@", "111", "남"},
				          {"맹구", "two" ,"two@","222","남"},
				          {"훈이","three","three@","333","남"},
				          {"철수","four","four@","444","남"},
				          {"장미","five", "five@", "555","여"}};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		for(int i = 0; i < frd.length; i++) {
				if(name.equals(frd[i][0])) {
					System.out.println(Arrays.toString(frd[i]));
			}
		}
		
	}
}
