package day17;
/*
 	���� - ������
�״� ������ �ϴ��� �췯��
�� �� �β����� ���⸦,
�ٻ��� �̴� �ٶ�����
���� ���ο��ߴ�.
���� �뷡�ϴ� ��������
��� �׾� ���� ���� ����ؾ���
�׸��� ������ �־��� ����
�ɾ�߰ڴ�.

���� �㿡�� ���� �ٶ��� ��ġ���.

�� �ø� �ϳ��� ������ �����Ѻ���. 

 */
public class Test03 {
	public Test03() {
		String poem = new String("���� - ������\n");
		
		// ���ڿ� �� ��ȭ�� ���� ���ڿ��� StringBuffer�� �۾��� ó���ϴ� ���� ����.
		StringBuffer buff = new StringBuffer(poem);
//		System.out.println(poem);
		
		// ���ڿ��� ����ؼ� �����ش�
		buff.append("\n");
		buff.append("�״� ������ �ϴ��� �췯��\n");
		buff.append("�� �� �β����� ���⸦,\n");
		buff.append("�ٻ��� �̴� �ٶ�����\n");
		buff.append("���� ���ο��ߴ�.\n");
		buff.append("���� �뷡�ϴ� ��������\n");
		buff.append("��� �׾� ���� ���� ����ؾ���\n");
		buff.append("�׸��� ������ �־��� ����\n");
		buff.append("�ɾ�߰ڴ�.\n");
		buff.append("\n");
		buff.append("���� �㿡�� ���� �ٶ��� ��ġ���.\n");
		
		// StringBuffer�� ���ڿ� �����۾��� ����Ǹ� �ݵ�� String Ÿ������ ��ȯ�����ִ� ���� ����.
//		poem = new String(buff);
		poem = buff.toString();
		
		System.out.println(poem);

	}
	
	public static void main(String[] args) {
		new Test03();
	}
}
