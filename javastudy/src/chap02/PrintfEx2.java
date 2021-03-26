package chap02;

public class PrintfEx2 {

	public static void main(String[] args) {
		String url = "www.codechobo.com";
		
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1);	// %f가 주로 쓰이고 %e는 지수형태 %g는 간단하게 표현
		System.out.printf("f2 = %f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d = %f%n", d);	// %f 는 소수점이하 6자리까지만 출력
		System.out.printf("d=%14.10f%n", d);	// 14자리 중 소수점 10자리
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);		//	우측정렬
		System.out.printf("[%-20s]%n", url);	//	좌측정렬
		System.out.printf("[%.8s]%n", url);	// 왼쪽에서 8글자만 출력
		
		
	}

}
