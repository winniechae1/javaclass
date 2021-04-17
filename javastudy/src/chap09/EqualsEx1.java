package chap09;
// equals 메서드는 두 개의 참조변수가 같은 객체를 참조하고있는지
// 두 참조변수에 저장된 값이 같은지를 판단하는 기능만 한다.
public class EqualsEx1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)){
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다.");
		}
		v2 = v1;
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다.");
		}
	}
}
class Value {
	int value;
	
	Value(int value){
		this.value = value;
	}
}
