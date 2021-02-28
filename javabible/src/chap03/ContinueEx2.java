package chap03;

public class ContinueEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		label:
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					if(j == 3) {
						continue label;
					}
					System.out.println("i°ª: " + i + ", j°ª: " + j);
				}
			}
	}

}
