package day03;

public class Test05 {
	public static void main(String[] args) {
		
		int no1 = 10;
		int no2 = 20;
		String str = no1 > no2 ? 
					"no1�� no2���� Ů�ϴ�." :
					"no1�� no2���� �۽��ϴ�.";
		System.out.println("no1 > no2 : " + str);
		
		System.out.println("no1 > no2 : " +
				(no1 > no2 ? "no1�� no2���� Ů�ϴ�." : "no1�� no2���� �۽��ϴ�."));
	}
}
