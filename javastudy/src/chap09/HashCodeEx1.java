package chap09;

public class HashCodeEx1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());	// string 클래스는 문자열의 내용이 같으면 동일한 해시코드를
		System.out.println(str2.hashCode());	// 반환하도록 hashcode메서드에 오버라이딩 되어있다.
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));	
		// System.identityHashCode(Object x)는 Object클래스의 hashCode() 객체의 주소값으로 해시코드를 생성
		// 하기때문에 모든 객체에 대해 항상 다른 해시코드값을 반환할 것을 보장한다.
		
	}

}
