package day07;

/*
 	1 ~ 10 ���� ���ڸ� �������  ����� �迭�� ����� 
 	�� ���ڵ��� �����ϰ� ��� ��µǵ��� �غ���. 
 	
 	����] 
 		�迭�� Ư�� ��ġ 2���� �����ϰ� ���� �����͸� �ٲ۴� 
 		�� Ƚ���� ���� �ϸ� �Ҽ��� �����Ͱ� ���� Ȯ���� ����. 
 		
 */
public class Test02 {

	public static void main(String[] args) {
		// 1 ~ 10 ���� ����ϴ� �迭�� �����.
		
//		int [] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		int [] num = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		int[] num = new int[10];
		for(int i = 0; i < 10; i++) {
			num[i] = i + 1;
		}
		// ������ �� ��ġ���� ���� �����͸� �ٲ㺸�ڴ�.(100��)
		
		for(int i = 0; i < 100; i++) {
			int pos1 = (int)(Math.random() * 10);
			int pos2 = (int)(Math.random() * 10);      
			
//			�� ��ġ�� �����͸� �ٲ۴�.
//			���� ������ �ϳ��� ��ġ���� ����Ų��.
			int tmp = num[pos1];
			
			num[pos1] = num[pos2]; // num[pos1] == num[pos2]
			num[pos2] = tmp;
			System.out.print(pos1 + " , ");
		}
		System.out.println();
		
		// ����Ѵ�.
		System.out.print("| ");
		for(int no : num) {
			System.out.print(no + " | ");
		}
	}

}
