package day06;
/*
 	10개의 문자를 기억할 메모리를 만들고 
 	메모리에 'A' ~ 'J' 까지 차례로 기억한 후 출력하세요.
 */
public class Test05 {

	public static void main(String[] args) {
//			주소를 기억할 변수를 준비
		char[] ch ;
		
//		Heap에 메모리 공간이나 확보하고 
		
		ch = new char[10];
		
		// 반복해서 각 방에 데이터 채우고 
		for(int i= 0; i < 10; i++) {
			ch[i] = (char)('A' + i);
		}
		// 하나씩 꺼내서 출력한다.
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " , ");
		}
		System.out.println();
		
//		향상된 for 명령 (for each 명령)
		for(char c : ch) {
			// 이 반복문은 배열(ch)에 담긴 내용을 하나씩 꺼내서 
			// 변수 c에 순차적으로 대입시킨다. 
			// 결과적으로 모든 데이터를 순차적으로 꺼내서 처리하고 종료된다.
			System.out.print(c + " , ");
			}
	}

}
