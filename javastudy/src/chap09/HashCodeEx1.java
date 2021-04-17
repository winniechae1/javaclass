package chap09;

public class HashCodeEx1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());	// string Ŭ������ ���ڿ��� ������ ������ ������ �ؽ��ڵ带
		System.out.println(str2.hashCode());	// ��ȯ�ϵ��� hashcode�޼��忡 �������̵� �Ǿ��ִ�.
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));	
		// System.identityHashCode(Object x)�� ObjectŬ������ hashCode() ��ü�� �ּҰ����� �ؽ��ڵ带 ����
		// �ϱ⶧���� ��� ��ü�� ���� �׻� �ٸ� �ؽ��ڵ尪�� ��ȯ�� ���� �����Ѵ�.
		
	}

}
