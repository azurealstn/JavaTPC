import kr.tpc.A;
import kr.tpc.B;

public class TPC30 {
	public static void main(String[] args) {
		//instanceof 를 이용한 각각의 메소드 실행
		A a = new A();
		display(a);
		B b = new B();
		display(b);
		
		System.out.println("=================");
		
		//다형성배열을 이용한 각각의 메소드 실행
		Object[] objects = new Object[2];
		objects[0] = new A();
		objects[1] = new B();
		
		for (Object object : objects) {
			if (object instanceof A) {
				A a1 = (A) object;
				a1.go();
			} else {
				B b1 = (B) object;
				b1.go();
			}
		}
	}

	private static void display(Object object) {
		if (object instanceof A) {
			A a = (A) object;
			a.go();
		} else {
			B b = (B) object;
			b.go();
		}
	}
}