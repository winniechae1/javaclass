package chap03;

public class ContinueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			if(i % 4 == 0) {
				
				continue;
			}
			System.out.println("i °ª:" + i);
		}
	}

}
