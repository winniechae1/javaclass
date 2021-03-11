package chap07;
/*
 	instanceof ������ : ���������� �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ���� �˾ƺ��� ���� ����ϴ� ��.
 	�ַ� ���ǹ��� ���Ǹ� �������� instanceof Ŭ������(Ÿ��) 
 	������ ����� true �Ǵ� false �� ���� �ϳ��� ��ȯ�Ѵ�.
 	[7-17]
 */
public class InstanceofTest {

	public static void main(String[] args) {
		FireEngine3 fe3 = new FireEngine3();
		
		if(fe3 instanceof FireEngine3) {
			System.out.println("This is a FireEngine3 instance");
		}
		if(fe3 instanceof Car3) {
			System.out.println("This is a Car3 instance");
		}
		if(fe3 instanceof Object) {
			System.out.println("This is an Object instance");
		}
		System.out.println(fe3.getClass().getName());
	}
}

class Car3 {
	
}
class FireEngine3 extends Car3 {
	
}