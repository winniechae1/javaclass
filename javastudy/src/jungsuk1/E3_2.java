package jungsuk1;

/*
 	�Ʒ��� �ڵ�� ����� ��µ� �ʿ��� �ٱ��� ���� �� ���� ���ϴ� �ڵ��̴� ���� ( ) .
����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� ����� ���� �� �ִٸ� 13���� �ٱ��� 
�� �ʿ��� ���̴� (1)�� �˸��� �ڵ带 �����ÿ� .

 */
public class E3_2 {

	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples%sizeOfBucket > 0) ? 
						(numOfApples/ sizeOfBucket) + 1 : (numOfApples/ sizeOfBucket);
		
		System.out.println("�ʿ��� �ٱ����� �� : " + numOfBucket);

	}

}
