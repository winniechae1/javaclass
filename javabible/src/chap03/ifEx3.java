package chap03;

public class ifEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su1 = 10;
		String res;
		
		if(su1 >= 41) {
			res = "����";
		} else if ( su1 >= 11 ) {
			res = "�߱�";
		} else if ( su1 >= 0 ) {
			res = "�ʱ�";
		} else 
			res = "����";
		
		System.out.println(res + "�Դϴ�.");
	}

}